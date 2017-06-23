var YijiConfig = {
// 商户id
    partner:"20160825020000752433",
// 密钥
    key:"05a29a66557ad2f3634534a940d3577c",
// 网管
    url:"https://openapi.yijifu.net/gateway.html?"
};



/**
 * 在应用中发送付款请求，替换掉构造form的应用
 * @param req
 * @param res
 */
var yijito = function () {
    //https://apidoc.yiji.com/website/api_detail.html?sericeNo=espOrderPay_1.0&id=8a949fbe564a569d0156e36025ae00c3&sericeName=%E8%AE%A2%E5%8D%95%E6%94%AF%E4%BB%98&schemeName=%E6%96%B0%E5%A4%96%E5%8D%A1%E6%94%B6%E5%8D%95#espOrderPay_1.0

    //请与贵网站订单系统中的唯一订单号匹配
    var orderNo = '20120708132325121';
    var service = 'espOrderPay';
    var partnerId = YijiConfig.partner;
    var signType = 'MD5';

    //把请求参数打包成数组
    var sParaTemp = [];

    sParaTemp.push(["orderNo", orderNo]);
    sParaTemp.push(["service", service]);
    sParaTemp.push(["partnerId", partnerId]);
    sParaTemp.push(["signType", signType]);

    // 业务接口
    sParaTemp.push(["merchOrderNo", 123]);
    sParaTemp.push(["goodsInfoList", '[{"goodsNumber":"3146165","goodsName":"笔记本电脑","goodsCount":"5","itemSharpProductcode":"计算机","itemSharpUnitPrice":"8888"}]']);
    sParaTemp.push(["orderDetail", '{"ipAddress":"192.168.4.2","billtoCountry":"中国","billtoState":"重庆","billtoCity":"重庆","billtoPostalcode":"401254","billtoEmail":"ee@yiji.com","billtoFirstname":"三","billtoLastname":"张","billtoPhonenumber":"10086100101","billtoStreet":"渝北区黄山大道中段","shiptoCity":"Covina","shiptoCountry":"American","shiptoFirstname":"Tom","shiptoLastname":"July","shiptoEmail":"xx@gmail.com","shiptoPhonenumber":"10086100101","shiptoPostalcode":"89123452115","shiptoState":"CA","shiptoStreet":"137 W San Bernardino Rd.","logisticsFee":"422","logisticsMode":"顺丰","logisticsModeNumber":"45","cardType":"Visa","customerEmail":"xx@gmail.com","customerPhonenumber":"123645132645","merchantEmail":"ss@gmail.com","merchantName":"Clippinger Chevrolet Oldsmobile","addressLine1":"Mxkss","addressLine2":"The Status"}']);
    sParaTemp.push(["currency", 'CNY']);
    sParaTemp.push(["userId", '20162546254684759658']);
    sParaTemp.push(["amount", '888.66']);
    sParaTemp.push(["webSite", 'de-front.com']);
    sParaTemp.push(["endReturnURL", 'de-front.com']);
    sParaTemp.push(["language", 'en']);
    sParaTemp.push(["deviceFingerprintId", 'sfkjddge534314edsa']);
    /**
     * 构造即时到帐接口
     * @param sParaTemp 请求参数集合
     * @return 表单提交HTML信息
     */
    var create_direct_pay_by_user = function (sParaTemp) {

        /**
         * 构造提交表单HTML数据
         * @param sParaTemp 请求参数数组
         * @param gateway 网关地址
         * @param strMethod 提交方式。两个值可选：post、get
         * @param strButtonName 确认按钮显示文字
         * @return 提交表单HTML文本
         */
        var buildURL= function (sParaTemp) {
            /**
             * 生成要请求给支付宝的参数数组
             * @param sParaTemp 请求前的参数数组
             * @return 要请求的参数数组
             */
            var buildRequestPara = function (sParaTemp) {
                var sPara = [];
                //除去数组中的空值和签名参数
                for (var i1 = 0; i1 < sParaTemp.length; i1++) {
                    var value = sParaTemp[i1];
                    if (value[1] == null || value[1] == "" || value[0] == "sign"
                        || value[0] == "sign_type") {
                        continue;
                    }
                    sPara.push(value);
                }
                sPara.sort();
                //生成签名结果
                var prestr = "";
                //把数组所有元素，按照“参数=参数值”的模式用“&”字符拼接成字符串
                for (var i2 = 0; i2 < sPara.length; i2++) {
                    var obj = sPara[i2];
                    if (i2 == sPara.length - 1) {
                        prestr = prestr + obj[0] + "=" + obj[1];
                    } else {
                        prestr = prestr + obj[0] + "=" + obj[1] + "&";
                    }

                }
                prestr = prestr + YijiConfig.key; //把拼接后的字符串再与安全校验码直接连接起来
                var crypto = require('crypto');
                var mysign = crypto.createHash('md5').update(prestr, 'utf-8').digest("hex");
                //签名结果与签名方式加入请求提交参数组中
                sPara.push(["sign", mysign]);

                return sPara;
            };
            //待请求参数数组
            var sPara = buildRequestPara(sParaTemp);
            var path=YijiConfig.url;


            for (var i3 = 0; i3 < sPara.length; i3++) {
                var obj = sPara[i3];
                var name = obj[0];
                var value = encodeURIComponent(obj[1]);
                if(i3<(sPara.length-1)){
                    path=path+name+"="+value+"&";
                }else{
                    path=path+name+"="+value;
                }
            }
            return path.toString();
        };
        return buildURL(sParaTemp);
    };
    
    //构造函数，生成请求URL
    var sURL = create_direct_pay_by_user(sParaTemp);
    console.log(sURL);
};

yijito();

var requestUrl=function(host,path,callback){
    var https = require('https');

    var options = {
        host: host,
        port: 443,
        path: path,
        method: 'GET'
    };

    var req = https.request(options, function(res) {
        console.log("statusCode: ", res.statusCode);
        console.log("headers: ", res.headers);

        res.on('data', function(d) {
            callback(d);
        });
    });
    req.end();

    req.on('error', function(e) {
        console.error(e);
    });
};

//获取验证码
var getMySign = function (params) {
    var sPara=[];//转换为数组利于排序 除去空值和签名参数
    if(!params) return null;
    for(var key in params) {
        if((!params[key])|| key == "sign" || key == "sign_type"){
            console.log('null:'+key);
            continue;
        } ;
        sPara.push([key,params[key]]);
    }
    sPara.sort();
    //生成签名结果
    var prestr = "";
    //把数组所有元素，按照“参数=参数值”的模式用“&”字符拼接成字符串
    for (var i2 = 0; i2 < sPara.length; i2++) {
        var obj = sPara[i2];
        if (i2 == sPara.length - 1) {
            prestr = prestr + obj[0] + "=" + obj[1];
        } else {
            prestr = prestr + obj[0] + "=" + obj[1] + "&";
        }

    }
    prestr = prestr + YijiConfig.key; //把拼接后的字符串再与安全校验码直接连接起来
    
    var crypto = require('crypto');
    return crypto.createHash('md5').update(prestr, YijiConfig.input_charset).digest("hex");
};
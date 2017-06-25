/*
var YijiConfig = {
// 商户id
    partner:"20170413020014185029",
// 密钥
    key:"21a121c1ca7c146581292c28892971f8",
// 网管
    url:"https://openapi.yijifu.net/gateway.html?"
};
*/

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
    var orderNo = '21180291139424518';
    var service = 'espOrderPay';
    var partnerId = YijiConfig.partner;
    var signType = 'MD5';

    var goodsInfoList = [{
        	'goodsNumber' : 'SKU001234',	//货号
            'goodsName' : '货名test',	//货物名称
            'goodsCount' : '1',	//货物数量
            'itemSharpProductcode' : '分类',	//商品分类
            'itemSharpUnitPrice': '1'	//商品单价
    }];

   var orderDetail = {
    'ipAddress' : '113.204.226.234',	//IP地址
	'billtoCountry' : 'China',	//账单国家
	'billtoState' : 'CA',	//账单州
	'billtoCity' : 'Covina',	//账单城市
	'billtoPostalcode' : '91723',	//账单邮编
	'billtoEmail' : 'jimmy.lei@yiji.com',	//账单邮箱

	'billtoFirstname' : 'James',	//接收账单人员名
	'billtoLastname' : 'kobe',	//接收账单人员姓
	'billtoPhonenumber' : '18602340234',	//账单电话
	'billtoStreet' : '137 W San Bernardino Rd',	//账单街道

	'shiptoCity' : 'Covina',	//收货城市
	'shiptoCountry' : 'United States',	//收货国家
	'shiptoFirstname' : 'James',	//收货人姓
	'shiptoLastname' : 'kobe',	//收货人名
	'shiptoEmail' : 'jimmy.lei@yiji.com',	//收货邮箱
	'shiptoPhonenumber' : '18602340234',	//收货电话
	'shiptoPostalcode' : '91723',	//收货邮编
	'shiptoState' : 'CA',	//收货州
	'shiptoStreet' : '137 W San Bernardino Rd',	//收货街道
	'logisticsFee' : '0.00',	//物流费
	'logisticsMode' : 'EMS',	//物流方式
	'cardType' : 'Visa',	//卡类型
	'customerEmail' : 'qixin@yiji.com',	//购买者邮箱
	'customerPhonenumber' : '13996412842',	//购买者电话
	'merchantEmail' : 'merchent@yiji.com',	//商户邮箱
	'merchantName' : '重庆易极付有限公司',	//商户名
	'addressLine1' : '',	//卡地址1
	'addressLine2' : ''	//卡地址2
}

    //把请求参数打包成数组
    var sParaTemp = [];
    sParaTemp.push(["orderNo", orderNo]);
    sParaTemp.push(["service", service]);
    sParaTemp.push(["partnerId", partnerId]);
    sParaTemp.push(["signType", signType]);
    // 业务接口
    sParaTemp.push(["merchOrderNo", '66668888wrwerewrwe777']);
    sParaTemp.push(["goodsInfoList", JSON.stringify(goodsInfoList)]);
    sParaTemp.push(["orderDetail", JSON.stringify(orderDetail)]);
    sParaTemp.push(["currency", 'CNY']);
    sParaTemp.push(["userId", partnerId]);
    sParaTemp.push(["amount", '888.66']);
    sParaTemp.push(["webSite", 'de-front.com']);
    sParaTemp.push(["endReturnURL", 'http://de-front.com/return']);
    sParaTemp.push(["returnUrl", 'http://de-front.com/return']);
    sParaTemp.push(["notifyUrl", 'http://de-front.com/return']);
    sParaTemp.push(["memo", '12222']);
    sParaTemp.push(["acquiringType", 'CRDIT']);
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

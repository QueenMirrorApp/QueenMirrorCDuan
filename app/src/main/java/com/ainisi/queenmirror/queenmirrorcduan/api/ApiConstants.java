package com.ainisi.queenmirror.queenmirrorcduan.api;


import com.ainisi.queenmirror.common.commonutils.SPManager;

/**
 * @author weikailiang
 * @function Created on 2017/7/26.
 */

public class ApiConstants {
    //http://test.meiyaoni.com.cn 测试环境
    //https://app.jiyuanet.com 线上环境
    public static final String BASE_HOST = "http://test.meiyaoni.com.cn";//neteast_host
    public static final String ROOT_URL = "WebService";
    public static final String IMG_URL = "http://test.meiyaoni.com.cn";
    public static final String COMMENT_NUM_ZERO = "0";
    public static final String COMMENT_NUM_ONE = "1";
    public static final String COMMENT_NUM_TWO = "2";
    public static final String COMMENT_NUM_THREE = "3";

    //店铺地址"http://meiyaoni.com.cn/WebService?"
    public static final String SHOP_ADDRESS = getHost(HostType.BASE_DATA_URL) + "/shop/shopShow?key=" + SPManager.getInstance().getToken() + "&shopId=";
    //关于我们
    public static final String ABOUT_US = getHost(HostType.BASE_DATA_URL) + "/About.html";
    //合作院校地址
    public static final String SCHOOL_COOPERATION = "http://m.ainisi888.com/";
    //用户密码加密秘钥
    public static String MD5_PWD = "MYN888";

    //***********************action start*****************************************

    public static final String NO_LOGIN_KEY = "MYN";
    public static final String THIS_DEVICE_SYSTEM = "Android";
    /*
    更新用户地址or添加用户地址
     */
    public static final String UPDATE_USER_ADDRESS_ACTION = "10221";
    /*
    用户地址列表
     */
    public static final String USER_ADDRESS_LIST_ACTION = "1022";
    /*
    删除用户地址
     */
    public static final String DELETE_USER_ADDRESS_ACTION = "10222";
    /*
    城市列表
     */
    public static final String CITY_LIST_ACTION = "1111";
    /*
    可用优惠卷列表or不可用优惠卷列表
     */
    @Deprecated
    public static final String AVAIL_COUPON_ACTION = "1020";
    /*
    主页home数据
     */
    public static final String HOME_DATA_ACTION = "7000";
    /*
    首页店铺列表
     */
    public static final String HOME_SHOP_LIST_ACTION = "6104";
    /*
    收藏列表or取消收藏
     */
    public static final String MY_FAV_ACTION = "7003";
    /*
    订单详情
     */
    public static final String ORDER_DETAIL_ACTION = "10242";
    /*
    取消订单
     */
    public static final String ORDER_CANCEL_ACTION = "10241";
    /*
    订单列表
     */
    public static final String ORDER_LIST_ACTION = "1024";
    /*
    订单时间获取
     */
    public static final String ORDER_TILE_SELECT_ACTION = "1116";
    /*
    生成订单
     */
    public static final String GENERATE_ORDER_ORDER = "1114";
    /*
    产品详情
     */
    public static final String PRODUCT_DETAIL_ACTION = "1115";
    /*
    产品列表
     */
    public static final String PRODUCT_LIST_ACTION = "1112";
    /*
    登录
     */
    public static final String USER_LOGIN_ACTION = "1001";
    /*
    第三方登录
     */
    public static final String THIRD_LOGIN_ACTION = "1004";
    /*
    获取验证码
     */
    public static final String SMS_CODE_ACTION = "10021";
    /*
    注册
     */
    public static final String REGISTER_ACTION = "1002";
    /*
    忘记密码
     */
    public static final String FORGET_PWD_ACTION = "2005";
    /*
    版本更新
     */
    public static final String UPDATE_CODE = "1090";
    /*
    技师列表请求
     */
    @Deprecated
    public static final String TECHNICIAN_LIST_ACTION = "1131";
    /*
    评论
     */
    public static final String COMMENT_ACTION = "11134";
    /*
    提交评论
     */
    public static final String COMMIT_COMMENT_ACTION = "11132";
    /*
    评价列表
     */
    public static final String COMMENT_LIST_ACTION = "11133";
    /*
    发送用户经纬度
     */
    public static final String SEND_USER_LATLNG_ACTION = "1000";
    /*
    搜索店铺或项目
     */
    public static final String SEARCH_PRODUCT_OR_SHOP_RESULT = "10212";
    /*
    获取热门搜索关键词
     */
    public static final String GET_HOT_SEARCH_WORD = "10211";
    /*
    提交订单
     */
    public static final String SUBMIT_PAYMENT_ORDER = "1118";
    /*
    分类精华产品获取
     */
    public static final String GET_ESSENCE_PRODUCTS = "11121";
    /*
    分类精华标签获取
     */
    public static final String GET_ESSENCE_PRODUCT_LABEL = "11122";
    /*
    退款
    */
    public static final String REFUND_MONEY = "2021";
    /*
    用户中心信息
     */
    public static final String USER_INFO = "1023";
    /*
    解绑
     */
    public static final String UNBINDING = "7007";
    /*
    绑定
     */
    public static final String BINDING = "7008";

    /*
    提交新手机号
     */
    public static final String SUBMIT_NEW_PHONE = "7006";

    /*
    待支付剩余时间
     */
    public static final String PAY_REMAINING_TIME = "6105";

    /*
    我的优惠券
     */
    public static final String MINE_DISCOUNT_COUPON = "4002";

    /*
    历史优惠券
     */
    public static final String HISTORY_DISCOUNT_COUPON = "4002";

    /*
    请求可用优惠券数量，提交订单界面下的
     */
    public static final String REQUEST_COUPON_AVAILABLE_NUMS = "4001";

    /*
    选择优惠券列表
     */
    public static final String CHOOSE_COUPON_LIST = "4001";

    /*
    定项券
     */
    public static final String REQUST_ASSIGN_COUPON = "4000";

    /*
    请求该订单的支付信息
     */
    public static final String REQUEST_PAY_ORDER_INFO = "4003";

    /**
     * 获取对应的host
     *
     * @param hostType host类型
     * @return host
     */
    public static String getHost(int hostType) {
        String host;
        switch (hostType) {
            case HostType.BASE_DATA_URL:
                host = BASE_HOST;
                break;
            case HostType.BASE_PIC_URL:
                host = IMG_URL;
                break;
            case HostType.ALIPY:
                host = BASE_HOST;
                break;
            default:
                host = "";
                break;
        }
        return host;
    }

    public static int BOTTOM_VIEW_HEIGHT = 60;

    public static void setBottomViewHeight(int height) {
        ApiConstants.BOTTOM_VIEW_HEIGHT = height;
    }

    public static int getBottomViewHeight() {
        return ApiConstants.BOTTOM_VIEW_HEIGHT;
    }

    //应用id wx75ddb85202aa7d95
    public static final String APP_ID = "wx75ddb85202aa7d95";//平台Id（自己换一下）
    public static final String APP_SECRET = "2c206b4d48e5ec2134477f3799195a5e";

    //用code换access_token
    public static String GET_REQUEST_ACCESS_TOKEN = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=";
    //获取微信用户资料
    public static String GET_REQUEST_USER_INFO = "https://api.weixin.qq.com/sns/userinfo?access_token=";
    //微信支付商户号
    public static final String WECHAT_MCH_ID = "1380317502";
    //API密钥:AppSecret是APPID对应的接口密码，用于获取接口调用凭证access_token时使用
    public static final String WECHAT_API_KEY = "yK7vcYHGZyzHoBRbNAtdcSnPvItiwNez";
    public static final String NOTIFY_URL = "http://meiyaoni.com.cn/alipay/alipay_notify.html";
    /**
     * 应用签名 4ce37eddb7403acc6855b9ccde64c8b4（上线环境下）
     */
}

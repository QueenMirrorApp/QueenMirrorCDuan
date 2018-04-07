package com.ainisi.queenmirror.queenmirrorcduan.api;



import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

import static com.ainisi.queenmirror.queenmirrorcduan.api.ApiConstants.ROOT_URL;


/**
 * @author weikailiang
 * @function Created on 2017/7/26.
 */

public interface ApiService {
    String ACTION = "action";
    String KEY = "key";

    /**
     * 首页数据请求
     *
     * @param key
     * @param action
     * @param cat_id
     * @param flag
     * @param app_type
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> homeData(@Field(KEY) String key, @Field(ACTION) String action, @Field("cat_id") String cat_id,
                                @Field("flag") String flag, @Field("app_type") String app_type);

    /**
     * 版本更新
     *
     * @param key
     * @param action
     * @param app_type
     * @param version
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> updataVersion(@Field(KEY) String key, @Field(ACTION) String action, @Field("app_type") String app_type, @Field("versionCode") String version);

    /**
     * 登陆
     *
     * @param key
     * @param action
     * @param account
     * @param pwd
     * @param device_id
     * @param system
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> login(@Field(KEY) String key, @Field(ACTION) String action, @Field("phone") String account, @Field("password") String pwd, @Field("device_id") String device_id, @Field("system") String system);

    /**
     * 第三方登录
     *
     * @param key
     * @param action
     * @param uid
     * @param name
     * @param gender
     * @param iconUrl
     * @param device_id
     * @param tag
     * @param system
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> thridPartyLogin(@Field(KEY) String key, @Field(ACTION) String action, @Field("uid") String uid,
                                       @Field("name") String name, @Field("gender") String gender, @Field("iconurl") String iconUrl,
                                       @Field("device_id") String device_id, @Field("tag") String tag, @Field("system") String system);

    /**
     * 解绑
     *
     * @param key
     * @param action
     * @param tag
     * @param system
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> unBindingThird(@Field(KEY) String key, @Field(ACTION) String action, @Field("tag") String tag,
                                      @Field("system") String system);

    /**
     * 绑定QQ或微信
     *
     * @param key
     * @param action
     * @param uid
     * @param name
     * @param gender
     * @param iconUrl
     * @param device_id
     * @param tag
     * @param system
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> BindingThird(@Field(KEY) String key, @Field(ACTION) String action, @Field("uid") String uid,
                                    @Field("name") String name, @Field("gender") String gender, @Field("iconurl") String iconUrl,
                                    @Field("device_id") String device_id, @Field("tag") String tag, @Field("system") String system);

    /**
     * 关联账号
     *
     * @param key
     * @param action
     * @param phone
     * @param pwd
     * @param device_id
     * @param system
     * @param uid
     * @param login_type
     * @param tag
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> accountAssocate(@Field(KEY) String key, @Field(ACTION) String action, @Field("phone") String phone,
                                       @Field("password") String pwd, @Field("device_id") String device_id,
                                       @Field("system") String system, @Field("uid") String uid, @Field("login_type") String login_type,
                                       @Field("tag") String tag);


    /**
     * 获取短信验证吗
     *
     * @param key
     * @param action
     * @param content
     * @param phone
     * @param client  1-用户端；2-商家端
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> msmCode(@Field(KEY) String key, @Field(ACTION) String action, @Field("content") String content, @Field("phone") String phone, @Field("duan") String client);

    /**
     * 注册
     *
     * @param key
     * @param action
     * @param phone
     * @param pwd
     * @param code
     * @param memberPushCode
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> register(@Field(KEY) String key, @Field(ACTION) String action, @Field("phone") String phone,
                                @Field("password") String pwd, @Field("mcode") String code, @Field("member_push_code") String memberPushCode);

    /**
     * 第三方快速注册
     *
     * @param key
     * @param action
     * @param phone
     * @param mcode
     * @param password
     * @param device_id
     * @param system
     * @param reg_type
     * @param uid
     * @param tag
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> quickRegister(@Field(KEY) String key, @Field(ACTION) String action, @Field("phone") String phone,
                                     @Field("mcode") String mcode, @Field("password") String password, @Field("device_id") String device_id,
                                     @Field("system") String system, @Field("reg_type") String reg_type,
                                     @Field("uid") String uid, @Field("tag") String tag);

    /**
     * 找回密码
     *
     * @param key
     * @param action
     * @param phone
     * @param pwd
     * @param mcode
     * @return
     */
    @FormUrlEncoded
    @POST(ROOT_URL)
    Observable<Object> findPassword(@Field(KEY) String key, @Field(ACTION) String action, @Field("phone") String phone,
                                    @Field("password") String pwd, @Field("mcode") String mcode, @Field("duan") String duan);

}


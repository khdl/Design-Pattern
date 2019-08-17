package com.yu.adapter;

/**
 * @className: ThirdLogin
 * @author: yu.liu
 * @date: 2019/8/17 12:57
 * @description:  不一用继承、实现
 *   可以注入进来（组合）
 */
public class ThirdLogin extends Login {
    public ResultMsg loginForQQ(String openId){
        //openId 全局唯一，当做一个用户名
        //密码默认为空（或者其他默认方式）
        //注册
        ResultMsg msg = super.regist(openId,null);
        //调用原来的登录方法
        msg = super.login(openId, null);
        return msg;
    }
    public ResultMsg loginForWechat(String openId){
        return null;
    }
    public ResultMsg loginForToken(String token){
        //通过token拿到用户信息重新登录一次
        return null;
    }
    public ResultMsg loginForTelphone(String telphone, String code){
        return null;
    }

    public ResultMsg loginForRegist(String name, String password){
        return null;
    }


}

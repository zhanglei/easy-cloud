package com.easy.cloud.core.oauth.client.wechat.request.builder;

import com.easy.cloud.core.oauth.client.base.request.builder.EcBaseTokenRequestBuilder;
import com.easy.cloud.core.oauth.client.base.response.resource.EcBaseOauthTokenResponse;
import com.easy.cloud.core.oauth.client.wechat.response.token.EcWechatOauthTokenResponse;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

import java.util.Map;

/**
 * @author daiqi
 * @create 2018-07-02 16:29
 */
public class EcTokenWechatRequestBuilder extends EcBaseTokenRequestBuilder {

    public EcTokenWechatRequestBuilder(String url) {
        super(url);
    }

    @Override
    public Class<? extends EcBaseOauthTokenResponse> getTokenResponseClass() {
        return EcWechatOauthTokenResponse.class;
    }

    @Override
    public OAuthClientRequest buildClientRequest(Map<String, Object> oauthTokenParam) throws OAuthSystemException {
        this.parameters.putAll(oauthTokenParam);
        return this.buildQueryMessage();
    }
}

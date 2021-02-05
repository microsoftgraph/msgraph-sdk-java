# Authentication upgrade examples

The purpose of this document is to provide examples on how to upgrade your authentication providers to azure-identity providers.

## Authorization code flow

Replace any of the following:

```Java
AuthorizationCodeProvider authProvider = new AuthorizationCodeProvider(CLIENT_ID, SCOPES, AUTHORIZATION_CODE, REDIRECT_URL, NATIONAL_CLOUD, TENANT, CLIENT_SECRET);
IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).buildClient();
```

By

``` Java
final AuthorizationCodeCredential authCodeCredential = new AuthorizationCodeCredentialBuilder()
    .clientId(CLIENT_ID)
    .clientSecret(CLIENT_SECRET) //required for web apps, skip it for native apps
    .authorizationCode(AUTHORIZATION_CODE)
    .redirectUrl(REDIRECT_URL)
    .build();
final TokenCredentialAuthProvider authProvider = new TokenCredentialAuthProvider(SCOPES, authCodeCredential);
final GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).buildClient();
```

## Client credential flow

Replace any of the following:

```Java
ClientCredentialProvider authProvider = new ClientCredentialProvider(CLIENT_ID, SCOPES, CLIENT_SECRET, TENANT_GUID, NATIONAL_CLOUD);
IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).buildClient();
```

By

``` Java
final ClientSecretCredential clientSecretCredential = new ClientSecretCredentialBuilder()
    .clientId(CLIENT_ID)
    .clientSecret(CLIENT_SECRET)
    .tenantId(TENANT_GUID)
    .build();
final TokenCredentialAuthProvider authProvider = new TokenCredentialAuthProvider(SCOPES, clientSecretCredential);
final GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).buildClient();
```

> Note: you can alternatively use **ClientCertificateCredential** to authenticate using a certificate instead of a secret. Using certificates for authentication was not previously supported.

## User name and password flow

Replace any of the following:

```Java
UsernamePasswordProvider authProvider = new UsernamePasswordProvider(CLIENT_ID, SCOPES, USERNAME, PASSWORD, NATIONAL_CLOUD, TENANT, CLIENT_SECRET);
IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).buildClient();
```

By

``` Java
final UsernamePasswordCredential usernamePasswordCredential = new UsernamePasswordCredentialBuilder()
    .clientId(CLIENT_ID)
    .username(USERNAME)
    .password(PASSWORD)
    .build();
final TokenCredentialAuthProvider authProvider = new TokenCredentialAuthProvider(SCOPES, usernamePasswordCredential);
final GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).buildClient();
```

## Device code flow

> Note: the device code flow was previously not available, some customers might have implemented custom authentication providers in their application to bridge the feature gap. That custom code can now be replaced.

Replace any of the following:

```Java
CustomBuiltDeviceCodeProvider authProvider = new CustomBuiltDeviceCodeProvider(CLIENT_ID); // code specific to the custom implementation
IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).buildClient();
```

By

``` Java
final DeviceCodeCredential deviceCodeCredential = new DeviceCodeCredentialBuilder()
    .clientId(CLIENT_ID)
    .challengeConsumer(challenge -> {
                        // lets user know of the challenge
                        System.out.println(challenge.getMessage());
                    })
    .build();
final TokenCredentialAuthProvider authProvider = new TokenCredentialAuthProvider(SCOPES, deviceCodeCredential);
final GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).buildClient();
```

## Interactive browser flow

Replace any of the following:

```Java
PublicClientApplication publicClientApplication = new PublicClientApplication(getApplicationContext(), CLIENT_ID);
MSALAuthenticationProvider msalAuthenticationProvider = new MSALAuthenticationProvider(
    getActivity(),
    getApplication(),
    publicClientApplication,
    scopes);
CustomBuiltBrowserProvider authProvider = new CustomBuiltBrowserProvider(CLIENT_ID, REDIRECT_URL);
IGraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).buildClient();
```

And

```Java
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    msalAuthenticationProvider.handleInteractiveRequestRedirect(requestCode, resultCode, data);
}
```

By

``` Java
final InteractiveBrowserCredential interactiveBrowserCredential = new InteractiveBrowserCredentialBuilder()
    .clientId(CLIENT_ID)
    .redirectUrl(REDIRECT_URL)
    .build();
final TokenCredentialAuthProvider authProvider = new TokenCredentialAuthProvider(SCOPES, interactiveBrowserCredential);
final GraphServiceClient graphClient = GraphServiceClient.builder().authenticationProvider(authProvider).buildClient();
```

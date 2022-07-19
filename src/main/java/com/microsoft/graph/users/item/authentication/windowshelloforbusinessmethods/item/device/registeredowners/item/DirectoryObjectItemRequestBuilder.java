package microsoft.graph.users.item.authentication.windowshelloforbusinessmethods.item.device.registeredowners.item;

import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import microsoft.graph.users.item.authentication.windowshelloforbusinessmethods.item.device.registeredowners.item.approleassignment.AppRoleAssignmentRequestBuilder;
import microsoft.graph.users.item.authentication.windowshelloforbusinessmethods.item.device.registeredowners.item.endpoint.EndpointRequestBuilder;
import microsoft.graph.users.item.authentication.windowshelloforbusinessmethods.item.device.registeredowners.item.ref.RefRequestBuilder;
import microsoft.graph.users.item.authentication.windowshelloforbusinessmethods.item.device.registeredowners.item.serviceprincipal.ServicePrincipalRequestBuilder;
import microsoft.graph.users.item.authentication.windowshelloforbusinessmethods.item.device.registeredowners.item.user.UserRequestBuilder;
/** Builds and executes requests for operations under /users/{user-id}/authentication/windowsHelloForBusinessMethods/{windowsHelloForBusinessAuthenticationMethod-id}/device/registeredOwners/{directoryObject-id} */
public class DirectoryObjectItemRequestBuilder {
    /** The appRoleAssignment property */
    @javax.annotation.Nonnull
    public AppRoleAssignmentRequestBuilder appRoleAssignment() {
        return new AppRoleAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /** The endpoint property */
    @javax.annotation.Nonnull
    public EndpointRequestBuilder endpoint() {
        return new EndpointRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The Ref property */
    @javax.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The servicePrincipal property */
    @javax.annotation.Nonnull
    public ServicePrincipalRequestBuilder servicePrincipal() {
        return new ServicePrincipalRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The user property */
    @javax.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DirectoryObjectItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DirectoryObjectItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/authentication/windowsHelloForBusinessMethods/{windowsHelloForBusinessAuthenticationMethod%2Did}/device/registeredOwners/{directoryObject%2Did}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DirectoryObjectItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DirectoryObjectItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}/authentication/windowsHelloForBusinessMethods/{windowsHelloForBusinessAuthenticationMethod%2Did}/device/registeredOwners/{directoryObject%2Did}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
}

package com.microsoft.graph.solutions.bookingbusinesses.item;

import com.microsoft.graph.models.BookingBusiness;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.solutions.bookingbusinesses.item.appointments.AppointmentsRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.appointments.item.BookingAppointmentItemRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.customers.CustomersRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.customers.item.BookingCustomerBaseItemRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.customquestions.CustomQuestionsRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.customquestions.item.BookingCustomQuestionItemRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.getstaffavailability.GetStaffAvailabilityRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.publish.PublishRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.services.item.BookingServiceItemRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.services.ServicesRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.staffmembers.item.BookingStaffMemberBaseItemRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.staffmembers.StaffMembersRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.unpublish.UnpublishRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the bookingBusinesses property of the microsoft.graph.solutionsRoot entity. */
public class BookingBusinessItemRequestBuilder {
    /** The appointments property */
    @javax.annotation.Nonnull
    public AppointmentsRequestBuilder appointments() {
        return new AppointmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendarView property */
    @javax.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The customers property */
    @javax.annotation.Nonnull
    public CustomersRequestBuilder customers() {
        return new CustomersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The customQuestions property */
    @javax.annotation.Nonnull
    public CustomQuestionsRequestBuilder customQuestions() {
        return new CustomQuestionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getStaffAvailability property */
    @javax.annotation.Nonnull
    public GetStaffAvailabilityRequestBuilder getStaffAvailability() {
        return new GetStaffAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The publish property */
    @javax.annotation.Nonnull
    public PublishRequestBuilder publish() {
        return new PublishRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The services property */
    @javax.annotation.Nonnull
    public ServicesRequestBuilder services() {
        return new ServicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The staffMembers property */
    @javax.annotation.Nonnull
    public StaffMembersRequestBuilder staffMembers() {
        return new StaffMembersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The unpublish property */
    @javax.annotation.Nonnull
    public UnpublishRequestBuilder unpublish() {
        return new UnpublishRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Gets an item from the com.Microsoft.Graph.solutions.bookingBusinesses.item.appointments.item collection
     * @param id Unique identifier of the item
     * @return a BookingAppointmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.solutions.bookingbusinesses.item.appointments.item.BookingAppointmentItemRequestBuilder appointments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingAppointment%2Did", id);
        return new com.microsoft.graph.solutions.bookingbusinesses.item.appointments.item.BookingAppointmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.solutions.bookingBusinesses.item.calendarView.item collection
     * @param id Unique identifier of the item
     * @return a BookingAppointmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.solutions.bookingbusinesses.item.calendarview.item.BookingAppointmentItemRequestBuilder calendarView(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingAppointment%2Did", id);
        return new com.microsoft.graph.solutions.bookingbusinesses.item.calendarview.item.BookingAppointmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new BookingBusinessItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public BookingBusinessItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/solutions/bookingBusinesses/{bookingBusiness%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new BookingBusinessItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public BookingBusinessItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/solutions/bookingBusinesses/{bookingBusiness%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property bookingBusinesses for solutions
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property bookingBusinesses for solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<BookingBusinessItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final BookingBusinessItemRequestBuilderDeleteRequestConfiguration requestConfig = new BookingBusinessItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get bookingBusinesses from solutions
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get bookingBusinesses from solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<BookingBusinessItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final BookingBusinessItemRequestBuilderGetRequestConfiguration requestConfig = new BookingBusinessItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property bookingBusinesses in solutions
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final BookingBusiness body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property bookingBusinesses in solutions
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final BookingBusiness body, @javax.annotation.Nullable final java.util.function.Consumer<BookingBusinessItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final BookingBusinessItemRequestBuilderPatchRequestConfiguration requestConfig = new BookingBusinessItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the com.Microsoft.Graph.solutions.bookingBusinesses.item.customers.item collection
     * @param id Unique identifier of the item
     * @return a BookingCustomerBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public BookingCustomerBaseItemRequestBuilder customers(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingCustomerBase%2Did", id);
        return new BookingCustomerBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.solutions.bookingBusinesses.item.customQuestions.item collection
     * @param id Unique identifier of the item
     * @return a BookingCustomQuestionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public BookingCustomQuestionItemRequestBuilder customQuestions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingCustomQuestion%2Did", id);
        return new BookingCustomQuestionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property bookingBusinesses for solutions
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property bookingBusinesses for solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<BookingBusinessItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete navigation property bookingBusinesses for solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<BookingBusinessItemRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get bookingBusinesses from solutions
     * @return a CompletableFuture of bookingBusiness
     */
    public java.util.concurrent.CompletableFuture<BookingBusiness> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get bookingBusinesses from solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of bookingBusiness
     */
    public java.util.concurrent.CompletableFuture<BookingBusiness> get(@javax.annotation.Nullable final java.util.function.Consumer<BookingBusinessItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get bookingBusinesses from solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of bookingBusiness
     */
    public java.util.concurrent.CompletableFuture<BookingBusiness> get(@javax.annotation.Nullable final java.util.function.Consumer<BookingBusinessItemRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property bookingBusinesses in solutions
     * @param body 
     * @return a CompletableFuture of bookingBusiness
     */
    public java.util.concurrent.CompletableFuture<BookingBusiness> patch(@javax.annotation.Nonnull final BookingBusiness body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property bookingBusinesses in solutions
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of bookingBusiness
     */
    public java.util.concurrent.CompletableFuture<BookingBusiness> patch(@javax.annotation.Nonnull final BookingBusiness body, @javax.annotation.Nullable final java.util.function.Consumer<BookingBusinessItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update the navigation property bookingBusinesses in solutions
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of bookingBusiness
     */
    public java.util.concurrent.CompletableFuture<BookingBusiness> patch(@javax.annotation.Nonnull final BookingBusiness body, @javax.annotation.Nullable final java.util.function.Consumer<BookingBusinessItemRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.solutions.bookingBusinesses.item.services.item collection
     * @param id Unique identifier of the item
     * @return a BookingServiceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public BookingServiceItemRequestBuilder services(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingService%2Did", id);
        return new BookingServiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.solutions.bookingBusinesses.item.staffMembers.item collection
     * @param id Unique identifier of the item
     * @return a BookingStaffMemberBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public BookingStaffMemberBaseItemRequestBuilder staffMembers(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingStaffMemberBase%2Did", id);
        return new BookingStaffMemberBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class BookingBusinessItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new BookingBusinessItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public BookingBusinessItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get bookingBusinesses from solutions */
    public class BookingBusinessItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class BookingBusinessItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public BookingBusinessItemRequestBuilderGetQueryParameters queryParameters = new BookingBusinessItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new BookingBusinessItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public BookingBusinessItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class BookingBusinessItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new BookingBusinessItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public BookingBusinessItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}

package com.microsoft.graph.solutions.bookingbusinesses.item;

import com.microsoft.graph.models.BookingBusiness;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.solutions.bookingbusinesses.item.appointments.AppointmentsRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.solutions.bookingbusinesses.item.calendarview.item.BookingAppointmentItemRequestBuilder;
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
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the bookingBusinesses property of the microsoft.graph.solutionsRoot entity.
 */
public class BookingBusinessItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the appointments property of the microsoft.graph.bookingBusiness entity. */
    @javax.annotation.Nonnull
    public AppointmentsRequestBuilder appointments() {
        return new AppointmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the calendarView property of the microsoft.graph.bookingBusiness entity. */
    @javax.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the customers property of the microsoft.graph.bookingBusiness entity. */
    @javax.annotation.Nonnull
    public CustomersRequestBuilder customers() {
        return new CustomersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the customQuestions property of the microsoft.graph.bookingBusiness entity. */
    @javax.annotation.Nonnull
    public CustomQuestionsRequestBuilder customQuestions() {
        return new CustomQuestionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getStaffAvailability method. */
    @javax.annotation.Nonnull
    public GetStaffAvailabilityRequestBuilder getStaffAvailability() {
        return new GetStaffAvailabilityRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the publish method. */
    @javax.annotation.Nonnull
    public PublishRequestBuilder publish() {
        return new PublishRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the services property of the microsoft.graph.bookingBusiness entity. */
    @javax.annotation.Nonnull
    public ServicesRequestBuilder services() {
        return new ServicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the staffMembers property of the microsoft.graph.bookingBusiness entity. */
    @javax.annotation.Nonnull
    public StaffMembersRequestBuilder staffMembers() {
        return new StaffMembersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the unpublish method. */
    @javax.annotation.Nonnull
    public UnpublishRequestBuilder unpublish() {
        return new UnpublishRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appointments property of the microsoft.graph.bookingBusiness entity.
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
     * Provides operations to manage the calendarView property of the microsoft.graph.bookingBusiness entity.
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
    @javax.annotation.Nullable
    public BookingBusinessItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/bookingBusinesses/{bookingBusiness%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new BookingBusinessItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public BookingBusinessItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/bookingBusinesses/{bookingBusiness%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to manage the customers property of the microsoft.graph.bookingBusiness entity.
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
     * Provides operations to manage the customQuestions property of the microsoft.graph.bookingBusiness entity.
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
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property bookingBusinesses for solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get bookingBusinesses from solutions
     * @return a CompletableFuture of bookingBusiness
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BookingBusiness> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BookingBusiness> executionException = new java.util.concurrent.CompletableFuture<BookingBusiness>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get bookingBusinesses from solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of bookingBusiness
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BookingBusiness> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BookingBusiness> executionException = new java.util.concurrent.CompletableFuture<BookingBusiness>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property bookingBusinesses in solutions
     * @param body The request body
     * @return a CompletableFuture of bookingBusiness
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BookingBusiness> patch(@javax.annotation.Nonnull final BookingBusiness body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BookingBusiness> executionException = new java.util.concurrent.CompletableFuture<BookingBusiness>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property bookingBusinesses in solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of bookingBusiness
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<BookingBusiness> patch(@javax.annotation.Nonnull final BookingBusiness body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, BookingBusiness::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<BookingBusiness> executionException = new java.util.concurrent.CompletableFuture<BookingBusiness>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the services property of the microsoft.graph.bookingBusiness entity.
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
     * Provides operations to manage the staffMembers property of the microsoft.graph.bookingBusiness entity.
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
    /**
     * Delete navigation property bookingBusinesses for solutions
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property bookingBusinesses for solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get bookingBusinesses from solutions
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get bookingBusinesses from solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property bookingBusinesses in solutions
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final BookingBusiness body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property bookingBusinesses in solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final BookingBusiness body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get bookingBusinesses from solutions
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}

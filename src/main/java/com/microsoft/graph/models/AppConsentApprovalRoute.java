package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppConsentApprovalRoute extends Entity implements Parsable {
    /** A collection of userConsentRequest objects for a specific application. */
    private java.util.List<AppConsentRequest> _appConsentRequests;
    /**
     * Instantiates a new AppConsentApprovalRoute and sets the default values.
     * @return a void
     */
    public AppConsentApprovalRoute() {
        super();
        this.setOdataType("#microsoft.graph.appConsentApprovalRoute");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppConsentApprovalRoute
     */
    @javax.annotation.Nonnull
    public static AppConsentApprovalRoute createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppConsentApprovalRoute();
    }
    /**
     * Gets the appConsentRequests property value. A collection of userConsentRequest objects for a specific application.
     * @return a appConsentRequest
     */
    @javax.annotation.Nullable
    public java.util.List<AppConsentRequest> getAppConsentRequests() {
        return this._appConsentRequests;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppConsentApprovalRoute currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appConsentRequests", (n) -> { currentObject.setAppConsentRequests(n.getCollectionOfObjectValues(AppConsentRequest::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appConsentRequests", this.getAppConsentRequests());
    }
    /**
     * Sets the appConsentRequests property value. A collection of userConsentRequest objects for a specific application.
     * @param value Value to set for the appConsentRequests property.
     * @return a void
     */
    public void setAppConsentRequests(@javax.annotation.Nullable final java.util.List<AppConsentRequest> value) {
        this._appConsentRequests = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessClientApplications implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Service principal IDs excluded from the policy scope.
     */
    private java.util.List<String> excludeServicePrincipals;
    /**
     * Service principal IDs included in the policy scope, or ServicePrincipalsInMyTenant.
     */
    private java.util.List<String> includeServicePrincipals;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The servicePrincipalFilter property
     */
    private ConditionalAccessFilter servicePrincipalFilter;
    /**
     * Instantiates a new conditionalAccessClientApplications and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessClientApplications() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessClientApplications
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessClientApplications createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessClientApplications();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the excludeServicePrincipals property value. Service principal IDs excluded from the policy scope.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeServicePrincipals() {
        return this.excludeServicePrincipals;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("excludeServicePrincipals", (n) -> { this.setExcludeServicePrincipals(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeServicePrincipals", (n) -> { this.setIncludeServicePrincipals(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("servicePrincipalFilter", (n) -> { this.setServicePrincipalFilter(n.getObjectValue(ConditionalAccessFilter::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includeServicePrincipals property value. Service principal IDs included in the policy scope, or ServicePrincipalsInMyTenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeServicePrincipals() {
        return this.includeServicePrincipals;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the servicePrincipalFilter property value. The servicePrincipalFilter property
     * @return a conditionalAccessFilter
     */
    @javax.annotation.Nullable
    public ConditionalAccessFilter getServicePrincipalFilter() {
        return this.servicePrincipalFilter;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeServicePrincipals", this.getExcludeServicePrincipals());
        writer.writeCollectionOfPrimitiveValues("includeServicePrincipals", this.getIncludeServicePrincipals());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("servicePrincipalFilter", this.getServicePrincipalFilter());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the excludeServicePrincipals property value. Service principal IDs excluded from the policy scope.
     * @param value Value to set for the excludeServicePrincipals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeServicePrincipals(@javax.annotation.Nullable final java.util.List<String> value) {
        this.excludeServicePrincipals = value;
    }
    /**
     * Sets the includeServicePrincipals property value. Service principal IDs included in the policy scope, or ServicePrincipalsInMyTenant.
     * @param value Value to set for the includeServicePrincipals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeServicePrincipals(@javax.annotation.Nullable final java.util.List<String> value) {
        this.includeServicePrincipals = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the servicePrincipalFilter property value. The servicePrincipalFilter property
     * @param value Value to set for the servicePrincipalFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalFilter(@javax.annotation.Nullable final ConditionalAccessFilter value) {
        this.servicePrincipalFilter = value;
    }
}

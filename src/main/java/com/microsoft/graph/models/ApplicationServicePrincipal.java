package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplicationServicePrincipal implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The application property
     */
    private Application application;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The servicePrincipal property
     */
    private ServicePrincipal servicePrincipal;
    /**
     * Instantiates a new applicationServicePrincipal and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplicationServicePrincipal() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applicationServicePrincipal
     */
    @javax.annotation.Nonnull
    public static ApplicationServicePrincipal createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationServicePrincipal();
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
     * Gets the application property value. The application property
     * @return a application
     */
    @javax.annotation.Nullable
    public Application getApplication() {
        return this.application;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("application", (n) -> { this.setApplication(n.getObjectValue(Application::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("servicePrincipal", (n) -> { this.setServicePrincipal(n.getObjectValue(ServicePrincipal::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the servicePrincipal property value. The servicePrincipal property
     * @return a servicePrincipal
     */
    @javax.annotation.Nullable
    public ServicePrincipal getServicePrincipal() {
        return this.servicePrincipal;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("application", this.getApplication());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("servicePrincipal", this.getServicePrincipal());
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
     * Sets the application property value. The application property
     * @param value Value to set for the application property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplication(@javax.annotation.Nullable final Application value) {
        this.application = value;
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
     * Sets the servicePrincipal property value. The servicePrincipal property
     * @param value Value to set for the servicePrincipal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipal(@javax.annotation.Nullable final ServicePrincipal value) {
        this.servicePrincipal = value;
    }
}

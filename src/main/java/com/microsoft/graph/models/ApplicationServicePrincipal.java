package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplicationServicePrincipal implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The application property */
    private Application _application;
    /** The OdataType property */
    private String _odataType;
    /** The servicePrincipal property */
    private ServicePrincipal _servicePrincipal;
    /**
     * Instantiates a new applicationServicePrincipal and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplicationServicePrincipal() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.applicationServicePrincipal");
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
        return this._additionalData;
    }
    /**
     * Gets the application property value. The application property
     * @return a application
     */
    @javax.annotation.Nullable
    public Application getApplication() {
        return this._application;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApplicationServicePrincipal currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("application", (n) -> { currentObject.setApplication(n.getObjectValue(Application::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("servicePrincipal", (n) -> { currentObject.setServicePrincipal(n.getObjectValue(ServicePrincipal::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the servicePrincipal property value. The servicePrincipal property
     * @return a servicePrincipal
     */
    @javax.annotation.Nullable
    public ServicePrincipal getServicePrincipal() {
        return this._servicePrincipal;
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the application property value. The application property
     * @param value Value to set for the application property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplication(@javax.annotation.Nullable final Application value) {
        this._application = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the servicePrincipal property value. The servicePrincipal property
     * @param value Value to set for the servicePrincipal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipal(@javax.annotation.Nullable final ServicePrincipal value) {
        this._servicePrincipal = value;
    }
}

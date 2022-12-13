package com.microsoft.graph.identityprotection.riskyserviceprincipals.confirmcompromised;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the confirmCompromised method.
 */
public class ConfirmCompromisedPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The servicePrincipalIds property */
    private java.util.List<String> _servicePrincipalIds;
    /**
     * Instantiates a new confirmCompromisedPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConfirmCompromisedPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a confirmCompromisedPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ConfirmCompromisedPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfirmCompromisedPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(1);
        deserializerMap.put("servicePrincipalIds", (n) -> { this.setServicePrincipalIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the servicePrincipalIds property value. The servicePrincipalIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getServicePrincipalIds() {
        return this._servicePrincipalIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("servicePrincipalIds", this.getServicePrincipalIds());
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
     * Sets the servicePrincipalIds property value. The servicePrincipalIds property
     * @param value Value to set for the servicePrincipalIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePrincipalIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._servicePrincipalIds = value;
    }
}

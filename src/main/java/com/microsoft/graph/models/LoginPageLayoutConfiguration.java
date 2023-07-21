package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LoginPageLayoutConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The isFooterShown property
     */
    private Boolean isFooterShown;
    /**
     * The isHeaderShown property
     */
    private Boolean isHeaderShown;
    /**
     * The layoutTemplateType property
     */
    private LayoutTemplateType layoutTemplateType;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new loginPageLayoutConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public LoginPageLayoutConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a loginPageLayoutConfiguration
     */
    @javax.annotation.Nonnull
    public static LoginPageLayoutConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LoginPageLayoutConfiguration();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isFooterShown", (n) -> { this.setIsFooterShown(n.getBooleanValue()); });
        deserializerMap.put("isHeaderShown", (n) -> { this.setIsHeaderShown(n.getBooleanValue()); });
        deserializerMap.put("layoutTemplateType", (n) -> { this.setLayoutTemplateType(n.getEnumValue(LayoutTemplateType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isFooterShown property value. The isFooterShown property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFooterShown() {
        return this.isFooterShown;
    }
    /**
     * Gets the isHeaderShown property value. The isHeaderShown property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHeaderShown() {
        return this.isHeaderShown;
    }
    /**
     * Gets the layoutTemplateType property value. The layoutTemplateType property
     * @return a layoutTemplateType
     */
    @javax.annotation.Nullable
    public LayoutTemplateType getLayoutTemplateType() {
        return this.layoutTemplateType;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isFooterShown", this.getIsFooterShown());
        writer.writeBooleanValue("isHeaderShown", this.getIsHeaderShown());
        writer.writeEnumValue("layoutTemplateType", this.getLayoutTemplateType());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the isFooterShown property value. The isFooterShown property
     * @param value Value to set for the isFooterShown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFooterShown(@javax.annotation.Nullable final Boolean value) {
        this.isFooterShown = value;
    }
    /**
     * Sets the isHeaderShown property value. The isHeaderShown property
     * @param value Value to set for the isHeaderShown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsHeaderShown(@javax.annotation.Nullable final Boolean value) {
        this.isHeaderShown = value;
    }
    /**
     * Sets the layoutTemplateType property value. The layoutTemplateType property
     * @param value Value to set for the layoutTemplateType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLayoutTemplateType(@javax.annotation.Nullable final LayoutTemplateType value) {
        this.layoutTemplateType = value;
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
}

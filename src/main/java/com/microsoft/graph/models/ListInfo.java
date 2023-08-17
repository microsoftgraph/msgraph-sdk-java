package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ListInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If true, indicates that content types are enabled for this list.
     */
    private Boolean contentTypesEnabled;
    /**
     * If true, indicates that the list is not normally visible in the SharePoint user experience.
     */
    private Boolean hidden;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * An enumerated value that represents the base list template used in creating the list. Possible values include documentLibrary, genericList, task, survey, announcements, contacts, and more.
     */
    private String template;
    /**
     * Instantiates a new listInfo and sets the default values.
     */
    public ListInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a listInfo
     */
    @jakarta.annotation.Nonnull
    public static ListInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListInfo();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the contentTypesEnabled property value. If true, indicates that content types are enabled for this list.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getContentTypesEnabled() {
        return this.contentTypesEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("contentTypesEnabled", (n) -> { this.setContentTypesEnabled(n.getBooleanValue()); });
        deserializerMap.put("hidden", (n) -> { this.setHidden(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("template", (n) -> { this.setTemplate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hidden property value. If true, indicates that the list is not normally visible in the SharePoint user experience.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHidden() {
        return this.hidden;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the template property value. An enumerated value that represents the base list template used in creating the list. Possible values include documentLibrary, genericList, task, survey, announcements, contacts, and more.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTemplate() {
        return this.template;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("contentTypesEnabled", this.getContentTypesEnabled());
        writer.writeBooleanValue("hidden", this.getHidden());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("template", this.getTemplate());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the contentTypesEnabled property value. If true, indicates that content types are enabled for this list.
     * @param value Value to set for the contentTypesEnabled property.
     */
    public void setContentTypesEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.contentTypesEnabled = value;
    }
    /**
     * Sets the hidden property value. If true, indicates that the list is not normally visible in the SharePoint user experience.
     * @param value Value to set for the hidden property.
     */
    public void setHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.hidden = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the template property value. An enumerated value that represents the base list template used in creating the list. Possible values include documentLibrary, genericList, task, survey, announcements, contacts, and more.
     * @param value Value to set for the template property.
     */
    public void setTemplate(@jakarta.annotation.Nullable final String value) {
        this.template = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents an app in the list of managed applications */
public class AppListItem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The application or bundle identifier of the application */
    private String _appId;
    /** The Store URL of the application */
    private String _appStoreUrl;
    /** The application name */
    private String _name;
    /** The OdataType property */
    private String _odataType;
    /** The publisher of the application */
    private String _publisher;
    /**
     * Instantiates a new appListItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppListItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appListItem
     */
    @javax.annotation.Nonnull
    public static AppListItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppListItem();
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
     * Gets the appId property value. The application or bundle identifier of the application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the appStoreUrl property value. The Store URL of the application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppStoreUrl() {
        return this._appStoreUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppListItem currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("appStoreUrl", (n) -> { currentObject.setAppStoreUrl(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
        }};
    }
    /**
     * Gets the name property value. The application name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
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
     * Gets the publisher property value. The publisher of the application
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("appStoreUrl", this.getAppStoreUrl());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("publisher", this.getPublisher());
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
     * Sets the appId property value. The application or bundle identifier of the application
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the appStoreUrl property value. The Store URL of the application
     * @param value Value to set for the appStoreUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppStoreUrl(@javax.annotation.Nullable final String value) {
        this._appStoreUrl = value;
    }
    /**
     * Sets the name property value. The application name
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
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
     * Sets the publisher property value. The publisher of the application
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
}

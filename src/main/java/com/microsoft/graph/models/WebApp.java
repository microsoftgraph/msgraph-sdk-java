package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WebApp extends MobileApp implements Parsable {
    /** The web app URL. This property cannot be PATCHed. */
    private String _appUrl;
    /** Whether or not to use managed browser. This property is only applicable for Android and IOS. */
    private Boolean _useManagedBrowser;
    /**
     * Instantiates a new WebApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WebApp() {
        super();
        this.setOdataType("#microsoft.graph.webApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WebApp
     */
    @javax.annotation.Nonnull
    public static WebApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebApp();
    }
    /**
     * Gets the appUrl property value. The web app URL. This property cannot be PATCHed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppUrl() {
        return this._appUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WebApp currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appUrl", (n) -> { currentObject.setAppUrl(n.getStringValue()); });
        deserializerMap.put("useManagedBrowser", (n) -> { currentObject.setUseManagedBrowser(n.getBooleanValue()); });
        return deserializerMap
    }
    /**
     * Gets the useManagedBrowser property value. Whether or not to use managed browser. This property is only applicable for Android and IOS.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseManagedBrowser() {
        return this._useManagedBrowser;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appUrl", this.getAppUrl());
        writer.writeBooleanValue("useManagedBrowser", this.getUseManagedBrowser());
    }
    /**
     * Sets the appUrl property value. The web app URL. This property cannot be PATCHed.
     * @param value Value to set for the appUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppUrl(@javax.annotation.Nullable final String value) {
        this._appUrl = value;
    }
    /**
     * Sets the useManagedBrowser property value. Whether or not to use managed browser. This property is only applicable for Android and IOS.
     * @param value Value to set for the useManagedBrowser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseManagedBrowser(@javax.annotation.Nullable final Boolean value) {
        this._useManagedBrowser = value;
    }
}

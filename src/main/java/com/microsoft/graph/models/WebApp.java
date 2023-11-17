package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for web apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebApp extends MobileApp implements Parsable {
    /**
     * Instantiates a new WebApp and sets the default values.
     */
    public WebApp() {
        super();
        this.setOdataType("#microsoft.graph.webApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WebApp
     */
    @jakarta.annotation.Nonnull
    public static WebApp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebApp();
    }
    /**
     * Gets the appUrl property value. The web app URL. This property cannot be PATCHed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppUrl() {
        return this.backingStore.get("appUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appUrl", (n) -> { this.setAppUrl(n.getStringValue()); });
        deserializerMap.put("useManagedBrowser", (n) -> { this.setUseManagedBrowser(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the useManagedBrowser property value. Whether or not to use managed browser. This property is only applicable for Android and IOS.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseManagedBrowser() {
        return this.backingStore.get("useManagedBrowser");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appUrl", this.getAppUrl());
        writer.writeBooleanValue("useManagedBrowser", this.getUseManagedBrowser());
    }
    /**
     * Sets the appUrl property value. The web app URL. This property cannot be PATCHed.
     * @param value Value to set for the appUrl property.
     */
    public void setAppUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appUrl", value);
    }
    /**
     * Sets the useManagedBrowser property value. Whether or not to use managed browser. This property is only applicable for Android and IOS.
     * @param value Value to set for the useManagedBrowser property.
     */
    public void setUseManagedBrowser(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useManagedBrowser", value);
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosiPadOSWebClip extends MobileApp implements Parsable {
    /** Indicates iOS/iPadOS web clip app URL. Example: 'https://www.contoso.com' */
    private String appUrl;
    /** Whether or not to use managed browser. When TRUE, the app will be required to be opened in Microsoft Edge. When FALSE, the app will not be required to be opened in Microsoft Edge. By default, this property is set to FALSE. */
    private Boolean useManagedBrowser;
    /**
     * Instantiates a new IosiPadOSWebClip and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosiPadOSWebClip() {
        super();
        this.setOdataType("#microsoft.graph.iosiPadOSWebClip");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosiPadOSWebClip
     */
    @javax.annotation.Nonnull
    public static IosiPadOSWebClip createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosiPadOSWebClip();
    }
    /**
     * Gets the appUrl property value. Indicates iOS/iPadOS web clip app URL. Example: 'https://www.contoso.com'
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppUrl() {
        return this.appUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appUrl", (n) -> { this.setAppUrl(n.getStringValue()); });
        deserializerMap.put("useManagedBrowser", (n) -> { this.setUseManagedBrowser(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the useManagedBrowser property value. Whether or not to use managed browser. When TRUE, the app will be required to be opened in Microsoft Edge. When FALSE, the app will not be required to be opened in Microsoft Edge. By default, this property is set to FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseManagedBrowser() {
        return this.useManagedBrowser;
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
     * Sets the appUrl property value. Indicates iOS/iPadOS web clip app URL. Example: 'https://www.contoso.com'
     * @param value Value to set for the appUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppUrl(@javax.annotation.Nullable final String value) {
        this.appUrl = value;
    }
    /**
     * Sets the useManagedBrowser property value. Whether or not to use managed browser. When TRUE, the app will be required to be opened in Microsoft Edge. When FALSE, the app will not be required to be opened in Microsoft Edge. By default, this property is set to FALSE.
     * @param value Value to set for the useManagedBrowser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseManagedBrowser(@javax.annotation.Nullable final Boolean value) {
        this.useManagedBrowser = value;
    }
}

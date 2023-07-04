package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsWebApp extends MobileApp implements Parsable {
    /**
     * Indicates the Windows web app URL. Example: 'https://www.contoso.com'
     */
    private String appUrl;
    /**
     * Instantiates a new WindowsWebApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsWebApp() {
        super();
        this.setOdataType("#microsoft.graph.windowsWebApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsWebApp
     */
    @javax.annotation.Nonnull
    public static WindowsWebApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsWebApp();
    }
    /**
     * Gets the appUrl property value. Indicates the Windows web app URL. Example: 'https://www.contoso.com'
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
        return deserializerMap;
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
    }
    /**
     * Sets the appUrl property value. Indicates the Windows web app URL. Example: 'https://www.contoso.com'
     * @param value Value to set for the appUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppUrl(@javax.annotation.Nullable final String value) {
        this.appUrl = value;
    }
}

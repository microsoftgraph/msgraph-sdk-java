package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsDeviceADAccount extends WindowsDeviceAccount implements Parsable {
    /** Not yet documented */
    private String domainName;
    /** Not yet documented */
    private String userName;
    /**
     * Instantiates a new WindowsDeviceADAccount and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDeviceADAccount() {
        super();
        this.setOdataType("#microsoft.graph.windowsDeviceADAccount");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDeviceADAccount
     */
    @javax.annotation.Nonnull
    public static WindowsDeviceADAccount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDeviceADAccount();
    }
    /**
     * Gets the domainName property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the userName property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this.userName;
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
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the domainName property value. Not yet documented
     * @param value Value to set for the domainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainName(@javax.annotation.Nullable final String value) {
        this.domainName = value;
    }
    /**
     * Sets the userName property value. Not yet documented
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this.userName = value;
    }
}

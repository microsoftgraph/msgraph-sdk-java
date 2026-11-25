package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A representation of a script that can be run on an end-user device managed by Intune in relation to a Win32 app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppScript extends MobileAppContentScript implements Parsable {
    /**
     * Instantiates a new {@link Win32LobAppScript} and sets the default values.
     */
    public Win32LobAppScript() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppScript");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Win32LobAppScript}
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppScript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.win32LobAppInstallPowerShellScript": return new Win32LobAppInstallPowerShellScript();
                case "#microsoft.graph.win32LobAppUninstallPowerShellScript": return new Win32LobAppUninstallPowerShellScript();
            }
        }
        return new Win32LobAppScript();
    }
    /**
     * Gets the enforceSignatureCheck property value. Indicates whether or not to enforce a signature check when running the script. When TRUE, the script cannot be run without enforcing a signature check. When FALSE, no signature check will be enforced when running the script. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnforceSignatureCheck() {
        return this.backingStore.get("enforceSignatureCheck");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enforceSignatureCheck", (n) -> { this.setEnforceSignatureCheck(n.getBooleanValue()); });
        deserializerMap.put("runAs32Bit", (n) -> { this.setRunAs32Bit(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the runAs32Bit property value. Indicates whether the script will run as 32-bit or 64-bit. When TRUE, the script will run as 32-bit. When FALSE, the script will run as 64-bit. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRunAs32Bit() {
        return this.backingStore.get("runAs32Bit");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enforceSignatureCheck", this.getEnforceSignatureCheck());
        writer.writeBooleanValue("runAs32Bit", this.getRunAs32Bit());
    }
    /**
     * Sets the enforceSignatureCheck property value. Indicates whether or not to enforce a signature check when running the script. When TRUE, the script cannot be run without enforcing a signature check. When FALSE, no signature check will be enforced when running the script. Default value is FALSE.
     * @param value Value to set for the enforceSignatureCheck property.
     */
    public void setEnforceSignatureCheck(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enforceSignatureCheck", value);
    }
    /**
     * Sets the runAs32Bit property value. Indicates whether the script will run as 32-bit or 64-bit. When TRUE, the script will run as 32-bit. When FALSE, the script will run as 64-bit. Default value is FALSE.
     * @param value Value to set for the runAs32Bit property.
     */
    public void setRunAs32Bit(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("runAs32Bit", value);
    }
}

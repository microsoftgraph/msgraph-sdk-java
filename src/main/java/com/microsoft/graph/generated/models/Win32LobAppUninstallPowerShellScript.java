package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A representation of a PowerShell script that is used to uninstall a Win32 app on an end-user device managed by Intune.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppUninstallPowerShellScript extends Win32LobAppScript implements Parsable {
    /**
     * Instantiates a new {@link Win32LobAppUninstallPowerShellScript} and sets the default values.
     */
    public Win32LobAppUninstallPowerShellScript() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppUninstallPowerShellScript");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Win32LobAppUninstallPowerShellScript}
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppUninstallPowerShellScript createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppUninstallPowerShellScript();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}

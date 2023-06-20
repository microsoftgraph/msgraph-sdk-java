package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedApp extends MobileApp implements Parsable {
    /** A managed (MAM) application's availability. */
    private ManagedAppAvailability appAvailability;
    /** The Application's version. */
    private String version;
    /**
     * Instantiates a new ManagedApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedApp() {
        super();
        this.setOdataType("#microsoft.graph.managedApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedApp
     */
    @javax.annotation.Nonnull
    public static ManagedApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.managedAndroidLobApp": return new ManagedAndroidLobApp();
                case "#microsoft.graph.managedAndroidStoreApp": return new ManagedAndroidStoreApp();
                case "#microsoft.graph.managedIOSLobApp": return new ManagedIOSLobApp();
                case "#microsoft.graph.managedIOSStoreApp": return new ManagedIOSStoreApp();
                case "#microsoft.graph.managedMobileLobApp": return new ManagedMobileLobApp();
            }
        }
        return new ManagedApp();
    }
    /**
     * Gets the appAvailability property value. A managed (MAM) application's availability.
     * @return a ManagedAppAvailability
     */
    @javax.annotation.Nullable
    public ManagedAppAvailability getAppAvailability() {
        return this.appAvailability;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appAvailability", (n) -> { this.setAppAvailability(n.getEnumValue(ManagedAppAvailability.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the version property value. The Application's version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeEnumValue("appAvailability", this.getAppAvailability());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the appAvailability property value. A managed (MAM) application's availability.
     * @param value Value to set for the appAvailability property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppAvailability(@javax.annotation.Nullable final ManagedAppAvailability value) {
        this.appAvailability = value;
    }
    /**
     * Sets the version property value. The Application's version.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}

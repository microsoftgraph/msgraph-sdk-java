package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains content properties for a specific app version. Each mobileAppContent can have multiple mobileAppContentFile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppContent extends Entity implements Parsable {
    /**
     * Instantiates a new MobileAppContent and sets the default values.
     */
    public MobileAppContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppContent
     */
    @jakarta.annotation.Nonnull
    public static MobileAppContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppContent();
    }
    /**
     * Gets the containedApps property value. The collection of contained apps in a MobileLobApp acting as a package.
     * @return a java.util.List<MobileContainedApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileContainedApp> getContainedApps() {
        return this.backingStore.get("containedApps");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("containedApps", (n) -> { this.setContainedApps(n.getCollectionOfObjectValues(MobileContainedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(MobileAppContentFile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. The list of files for this app content version.
     * @return a java.util.List<MobileAppContentFile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppContentFile> getFiles() {
        return this.backingStore.get("files");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("containedApps", this.getContainedApps());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
    }
    /**
     * Sets the containedApps property value. The collection of contained apps in a MobileLobApp acting as a package.
     * @param value Value to set for the containedApps property.
     */
    public void setContainedApps(@jakarta.annotation.Nullable final java.util.List<MobileContainedApp> value) {
        this.backingStore.set("containedApps", value);
    }
    /**
     * Sets the files property value. The list of files for this app content version.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<MobileAppContentFile> value) {
        this.backingStore.set("files", value);
    }
}

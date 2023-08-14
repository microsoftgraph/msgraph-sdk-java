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
public class MobileAppContent extends Entity implements Parsable {
    /**
     * The collection of contained apps in a MobileLobApp acting as a package.
     */
    private java.util.List<MobileContainedApp> containedApps;
    /**
     * The list of files for this app content version.
     */
    private java.util.List<MobileAppContentFile> files;
    /**
     * Instantiates a new mobileAppContent and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MobileAppContent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppContent
     */
    @jakarta.annotation.Nonnull
    public static MobileAppContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppContent();
    }
    /**
     * Gets the containedApps property value. The collection of contained apps in a MobileLobApp acting as a package.
     * @return a mobileContainedApp
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileContainedApp> getContainedApps() {
        return this.containedApps;
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
     * @return a mobileAppContentFile
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppContentFile> getFiles() {
        return this.files;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("containedApps", this.getContainedApps());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
    }
    /**
     * Sets the containedApps property value. The collection of contained apps in a MobileLobApp acting as a package.
     * @param value Value to set for the containedApps property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContainedApps(@jakarta.annotation.Nullable final java.util.List<MobileContainedApp> value) {
        this.containedApps = value;
    }
    /**
     * Sets the files property value. The list of files for this app content version.
     * @param value Value to set for the files property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<MobileAppContentFile> value) {
        this.files = value;
    }
}

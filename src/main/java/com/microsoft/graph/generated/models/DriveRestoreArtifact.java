package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DriveRestoreArtifact extends RestoreArtifactBase implements Parsable {
    /**
     * Instantiates a new {@link DriveRestoreArtifact} and sets the default values.
     */
    public DriveRestoreArtifact() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DriveRestoreArtifact}
     */
    @jakarta.annotation.Nonnull
    public static DriveRestoreArtifact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DriveRestoreArtifact();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("restoredSiteId", (n) -> { this.setRestoredSiteId(n.getStringValue()); });
        deserializerMap.put("restoredSiteName", (n) -> { this.setRestoredSiteName(n.getStringValue()); });
        deserializerMap.put("restoredSiteWebUrl", (n) -> { this.setRestoredSiteWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the restoredSiteId property value. The new site identifier if destinationType is new, and the input site ID if the destinationType is inPlace.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestoredSiteId() {
        return this.backingStore.get("restoredSiteId");
    }
    /**
     * Gets the restoredSiteName property value. The name of the restored site.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestoredSiteName() {
        return this.backingStore.get("restoredSiteName");
    }
    /**
     * Gets the restoredSiteWebUrl property value. The web URL of the restored site.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestoredSiteWebUrl() {
        return this.backingStore.get("restoredSiteWebUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("restoredSiteId", this.getRestoredSiteId());
    }
    /**
     * Sets the restoredSiteId property value. The new site identifier if destinationType is new, and the input site ID if the destinationType is inPlace.
     * @param value Value to set for the restoredSiteId property.
     */
    public void setRestoredSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restoredSiteId", value);
    }
    /**
     * Sets the restoredSiteName property value. The name of the restored site.
     * @param value Value to set for the restoredSiteName property.
     */
    public void setRestoredSiteName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restoredSiteName", value);
    }
    /**
     * Sets the restoredSiteWebUrl property value. The web URL of the restored site.
     * @param value Value to set for the restoredSiteWebUrl property.
     */
    public void setRestoredSiteWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restoredSiteWebUrl", value);
    }
}

package com.microsoft.graph.models.entrarecoveryservices;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecoveryJob extends RecoveryJobBase implements Parsable {
    /**
     * Instantiates a new {@link RecoveryJob} and sets the default values.
     */
    public RecoveryJob() {
        super();
        this.setOdataType("#microsoft.graph.entraRecoveryServices.recoveryJob");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecoveryJob}
     */
    @jakarta.annotation.Nonnull
    public static RecoveryJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecoveryJob();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("totalFailedChanges", (n) -> { this.setTotalFailedChanges(n.getIntegerValue()); });
        deserializerMap.put("totalLinksModified", (n) -> { this.setTotalLinksModified(n.getIntegerValue()); });
        deserializerMap.put("totalObjectsModified", (n) -> { this.setTotalObjectsModified(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalFailedChanges property value. The count of changes (including both objects and links) that failed to apply during recovery.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalFailedChanges() {
        return this.backingStore.get("totalFailedChanges");
    }
    /**
     * Gets the totalLinksModified property value. The count of directory object links (relationships) that were successfully modified during recovery. This value may be less than totalChangedLinksCalculated if some link changes failed.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLinksModified() {
        return this.backingStore.get("totalLinksModified");
    }
    /**
     * Gets the totalObjectsModified property value. The count of directory objects that were successfully modified during recovery. This value may be less than totalChangedObjectsCalculated if some object changes failed.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalObjectsModified() {
        return this.backingStore.get("totalObjectsModified");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("totalFailedChanges", this.getTotalFailedChanges());
        writer.writeIntegerValue("totalLinksModified", this.getTotalLinksModified());
        writer.writeIntegerValue("totalObjectsModified", this.getTotalObjectsModified());
    }
    /**
     * Sets the totalFailedChanges property value. The count of changes (including both objects and links) that failed to apply during recovery.
     * @param value Value to set for the totalFailedChanges property.
     */
    public void setTotalFailedChanges(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalFailedChanges", value);
    }
    /**
     * Sets the totalLinksModified property value. The count of directory object links (relationships) that were successfully modified during recovery. This value may be less than totalChangedLinksCalculated if some link changes failed.
     * @param value Value to set for the totalLinksModified property.
     */
    public void setTotalLinksModified(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLinksModified", value);
    }
    /**
     * Sets the totalObjectsModified property value. The count of directory objects that were successfully modified during recovery. This value may be less than totalChangedObjectsCalculated if some object changes failed.
     * @param value Value to set for the totalObjectsModified property.
     */
    public void setTotalObjectsModified(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalObjectsModified", value);
    }
}

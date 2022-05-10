package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Quota implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Total space consumed by files in the recycle bin, in bytes. Read-only. */
    private Long _deleted;
    /** Total space remaining before reaching the quota limit, in bytes. Read-only. */
    private Long _remaining;
    /** Enumeration value that indicates the state of the storage space. Read-only. */
    private String _state;
    /** Information about the drive's storage quota plans. Only in Personal OneDrive. */
    private StoragePlanInformation _storagePlanInformation;
    /** Total allowed storage space, in bytes. Read-only. */
    private Long _total;
    /** Total space used, in bytes. Read-only. */
    private Long _used;
    /**
     * Instantiates a new quota and sets the default values.
     * @return a void
     */
    public Quota() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a quota
     */
    @javax.annotation.Nonnull
    public static Quota createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Quota();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the deleted property value. Total space consumed by files in the recycle bin, in bytes. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDeleted() {
        return this._deleted;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Quota currentObject = this;
        return new HashMap<>(6) {{
            this.put("deleted", (n) -> { currentObject.setDeleted(n.getLongValue()); });
            this.put("remaining", (n) -> { currentObject.setRemaining(n.getLongValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
            this.put("storagePlanInformation", (n) -> { currentObject.setStoragePlanInformation(n.getObjectValue(StoragePlanInformation::createFromDiscriminatorValue)); });
            this.put("total", (n) -> { currentObject.setTotal(n.getLongValue()); });
            this.put("used", (n) -> { currentObject.setUsed(n.getLongValue()); });
        }};
    }
    /**
     * Gets the remaining property value. Total space remaining before reaching the quota limit, in bytes. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getRemaining() {
        return this._remaining;
    }
    /**
     * Gets the state property value. Enumeration value that indicates the state of the storage space. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Gets the storagePlanInformation property value. Information about the drive's storage quota plans. Only in Personal OneDrive.
     * @return a storagePlanInformation
     */
    @javax.annotation.Nullable
    public StoragePlanInformation getStoragePlanInformation() {
        return this._storagePlanInformation;
    }
    /**
     * Gets the total property value. Total allowed storage space, in bytes. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotal() {
        return this._total;
    }
    /**
     * Gets the used property value. Total space used, in bytes. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getUsed() {
        return this._used;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("deleted", this.getDeleted());
        writer.writeLongValue("remaining", this.getRemaining());
        writer.writeStringValue("state", this.getState());
        writer.writeObjectValue("storagePlanInformation", this.getStoragePlanInformation());
        writer.writeLongValue("total", this.getTotal());
        writer.writeLongValue("used", this.getUsed());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deleted property value. Total space consumed by files in the recycle bin, in bytes. Read-only.
     * @param value Value to set for the deleted property.
     * @return a void
     */
    public void setDeleted(@javax.annotation.Nullable final Long value) {
        this._deleted = value;
    }
    /**
     * Sets the remaining property value. Total space remaining before reaching the quota limit, in bytes. Read-only.
     * @param value Value to set for the remaining property.
     * @return a void
     */
    public void setRemaining(@javax.annotation.Nullable final Long value) {
        this._remaining = value;
    }
    /**
     * Sets the state property value. Enumeration value that indicates the state of the storage space. Read-only.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
    /**
     * Sets the storagePlanInformation property value. Information about the drive's storage quota plans. Only in Personal OneDrive.
     * @param value Value to set for the storagePlanInformation property.
     * @return a void
     */
    public void setStoragePlanInformation(@javax.annotation.Nullable final StoragePlanInformation value) {
        this._storagePlanInformation = value;
    }
    /**
     * Sets the total property value. Total allowed storage space, in bytes. Read-only.
     * @param value Value to set for the total property.
     * @return a void
     */
    public void setTotal(@javax.annotation.Nullable final Long value) {
        this._total = value;
    }
    /**
     * Sets the used property value. Total space used, in bytes. Read-only.
     * @param value Value to set for the used property.
     * @return a void
     */
    public void setUsed(@javax.annotation.Nullable final Long value) {
        this._used = value;
    }
}

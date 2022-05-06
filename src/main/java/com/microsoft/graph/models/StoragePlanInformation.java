package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class StoragePlanInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Indicates if there are higher storage quota plans available. Read-only.  */
    private Boolean _upgradeAvailable;
    /**
     * Instantiates a new storagePlanInformation and sets the default values.
     * @return a void
     */
    public StoragePlanInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a storagePlanInformation
     */
    @javax.annotation.Nonnull
    public static StoragePlanInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StoragePlanInformation();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final StoragePlanInformation currentObject = this;
        return new HashMap<>(1) {{
            this.put("upgradeAvailable", (n) -> { currentObject.setUpgradeAvailable(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the upgradeAvailable property value. Indicates if there are higher storage quota plans available. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUpgradeAvailable() {
        return this._upgradeAvailable;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("upgradeAvailable", this.getUpgradeAvailable());
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
     * Sets the upgradeAvailable property value. Indicates if there are higher storage quota plans available. Read-only.
     * @param value Value to set for the upgradeAvailable property.
     * @return a void
     */
    public void setUpgradeAvailable(@javax.annotation.Nullable final Boolean value) {
        this._upgradeAvailable = value;
    }
}

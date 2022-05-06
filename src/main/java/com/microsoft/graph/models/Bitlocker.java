package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Bitlocker extends Entity implements Parsable {
    /** The recovery keys associated with the bitlocker entity.  */
    private java.util.List<BitlockerRecoveryKey> _recoveryKeys;
    /**
     * Instantiates a new bitlocker and sets the default values.
     * @return a void
     */
    public Bitlocker() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bitlocker
     */
    @javax.annotation.Nonnull
    public static Bitlocker createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Bitlocker();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Bitlocker currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("recoveryKeys", (n) -> { currentObject.setRecoveryKeys(n.getCollectionOfObjectValues(BitlockerRecoveryKey::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the recoveryKeys property value. The recovery keys associated with the bitlocker entity.
     * @return a bitlockerRecoveryKey
     */
    @javax.annotation.Nullable
    public java.util.List<BitlockerRecoveryKey> getRecoveryKeys() {
        return this._recoveryKeys;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("recoveryKeys", this.getRecoveryKeys());
    }
    /**
     * Sets the recoveryKeys property value. The recovery keys associated with the bitlocker entity.
     * @param value Value to set for the recoveryKeys property.
     * @return a void
     */
    public void setRecoveryKeys(@javax.annotation.Nullable final java.util.List<BitlockerRecoveryKey> value) {
        this._recoveryKeys = value;
    }
}

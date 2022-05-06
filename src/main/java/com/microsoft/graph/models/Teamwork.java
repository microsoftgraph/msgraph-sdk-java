package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the teamwork singleton.  */
public class Teamwork extends Entity implements Parsable {
    /** A workforce integration with shifts.  */
    private java.util.List<WorkforceIntegration> _workforceIntegrations;
    /**
     * Instantiates a new teamwork and sets the default values.
     * @return a void
     */
    public Teamwork() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamwork
     */
    @javax.annotation.Nonnull
    public static Teamwork createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Teamwork();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Teamwork currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("workforceIntegrations", (n) -> { currentObject.setWorkforceIntegrations(n.getCollectionOfObjectValues(WorkforceIntegration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the workforceIntegrations property value. A workforce integration with shifts.
     * @return a workforceIntegration
     */
    @javax.annotation.Nullable
    public java.util.List<WorkforceIntegration> getWorkforceIntegrations() {
        return this._workforceIntegrations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("workforceIntegrations", this.getWorkforceIntegrations());
    }
    /**
     * Sets the workforceIntegrations property value. A workforce integration with shifts.
     * @param value Value to set for the workforceIntegrations property.
     * @return a void
     */
    public void setWorkforceIntegrations(@javax.annotation.Nullable final java.util.List<WorkforceIntegration> value) {
        this._workforceIntegrations = value;
    }
}

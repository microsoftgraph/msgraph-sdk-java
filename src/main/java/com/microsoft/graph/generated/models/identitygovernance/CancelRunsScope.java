package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CancelRunsScope extends CancelScope implements Parsable {
    /**
     * Instantiates a new {@link CancelRunsScope} and sets the default values.
     */
    public CancelRunsScope() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.cancelRunsScope");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CancelRunsScope}
     */
    @jakarta.annotation.Nonnull
    public static CancelRunsScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CancelRunsScope();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("runs", (n) -> { this.setRuns(n.getCollectionOfObjectValues(Run::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the runs property value. The runs property
     * @return a {@link java.util.List<Run>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Run> getRuns() {
        return this.backingStore.get("runs");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("runs", this.getRuns());
    }
    /**
     * Sets the runs property value. The runs property
     * @param value Value to set for the runs property.
     */
    public void setRuns(@jakarta.annotation.Nullable final java.util.List<Run> value) {
        this.backingStore.set("runs", value);
    }
}

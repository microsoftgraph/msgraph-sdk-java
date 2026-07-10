package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Audit data for Sensitivity Label Policy Match events.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensitivityLabelPolicyMatchAuditRecord extends AuditData implements Parsable {
    /**
     * Instantiates a new {@link SensitivityLabelPolicyMatchAuditRecord} and sets the default values.
     */
    public SensitivityLabelPolicyMatchAuditRecord() {
        super();
        this.setOdataType("#microsoft.graph.security.sensitivityLabelPolicyMatchAuditRecord");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SensitivityLabelPolicyMatchAuditRecord}
     */
    @jakarta.annotation.Nonnull
    public static SensitivityLabelPolicyMatchAuditRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityLabelPolicyMatchAuditRecord();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}

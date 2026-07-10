package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Audit data for P4AI Assessment Location Result events.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class P4aiAssessmentLocationResultRecord extends AuditData implements Parsable {
    /**
     * Instantiates a new {@link P4aiAssessmentLocationResultRecord} and sets the default values.
     */
    public P4aiAssessmentLocationResultRecord() {
        super();
        this.setOdataType("#microsoft.graph.security.p4aiAssessmentLocationResultRecord");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link P4aiAssessmentLocationResultRecord}
     */
    @jakarta.annotation.Nonnull
    public static P4aiAssessmentLocationResultRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new P4aiAssessmentLocationResultRecord();
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

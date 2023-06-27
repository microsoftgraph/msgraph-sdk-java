package com.microsoft.graph.communications.callrecords.microsoftgraphcallrecordsgetpstncallswithfromdatetimewithtodatetime;

import com.microsoft.graph.models.BaseCollectionPaginationCountResponse;
import com.microsoft.graph.models.callrecords.PstnCallLogRow;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GetPstnCallsWithFromDateTimeWithToDateTimeResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * The value property
     */
    private java.util.List<PstnCallLogRow> value;
    /**
     * Instantiates a new getPstnCallsWithFromDateTimeWithToDateTimeResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GetPstnCallsWithFromDateTimeWithToDateTimeResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getPstnCallsWithFromDateTimeWithToDateTimeResponse
     */
    @javax.annotation.Nonnull
    public static GetPstnCallsWithFromDateTimeWithToDateTimeResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetPstnCallsWithFromDateTimeWithToDateTimeResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(PstnCallLogRow::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a pstnCallLogRow
     */
    @javax.annotation.Nullable
    public java.util.List<PstnCallLogRow> getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final java.util.List<PstnCallLogRow> value) {
        this.value = value;
    }
}

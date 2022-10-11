package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the issues property of the microsoft.graph.serviceHealth entity. */
public class ServiceHealthIssueCollectionResponse extends BaseCollectionPaginationCountResponse implements Parsable {
    /** The value property */
    private java.util.List<ServiceHealthIssue> _value;
    /**
     * Instantiates a new ServiceHealthIssueCollectionResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceHealthIssueCollectionResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceHealthIssueCollectionResponse
     */
    @javax.annotation.Nonnull
    public static ServiceHealthIssueCollectionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceHealthIssueCollectionResponse();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServiceHealthIssueCollectionResponse currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("value", (n) -> { currentObject.setValue(n.getCollectionOfObjectValues(ServiceHealthIssue::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the value property value. The value property
     * @return a serviceHealthIssue
     */
    @javax.annotation.Nullable
    public java.util.List<ServiceHealthIssue> getValue() {
        return this._value;
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
    public void setValue(@javax.annotation.Nullable final java.util.List<ServiceHealthIssue> value) {
        this._value = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewSet extends Entity implements Parsable {
    /** Represents the template and scheduling for an access review. */
    private java.util.List<AccessReviewScheduleDefinition> definitions;
    /** Represents a collection of access review history data and the scopes used to collect that data. */
    private java.util.List<AccessReviewHistoryDefinition> historyDefinitions;
    /**
     * Instantiates a new AccessReviewSet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewSet
     */
    @javax.annotation.Nonnull
    public static AccessReviewSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewSet();
    }
    /**
     * Gets the definitions property value. Represents the template and scheduling for an access review.
     * @return a accessReviewScheduleDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewScheduleDefinition> getDefinitions() {
        return this.definitions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("definitions", (n) -> { this.setDefinitions(n.getCollectionOfObjectValues(AccessReviewScheduleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("historyDefinitions", (n) -> { this.setHistoryDefinitions(n.getCollectionOfObjectValues(AccessReviewHistoryDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the historyDefinitions property value. Represents a collection of access review history data and the scopes used to collect that data.
     * @return a accessReviewHistoryDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewHistoryDefinition> getHistoryDefinitions() {
        return this.historyDefinitions;
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
        writer.writeCollectionOfObjectValues("definitions", this.getDefinitions());
        writer.writeCollectionOfObjectValues("historyDefinitions", this.getHistoryDefinitions());
    }
    /**
     * Sets the definitions property value. Represents the template and scheduling for an access review.
     * @param value Value to set for the definitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefinitions(@javax.annotation.Nullable final java.util.List<AccessReviewScheduleDefinition> value) {
        this.definitions = value;
    }
    /**
     * Sets the historyDefinitions property value. Represents a collection of access review history data and the scopes used to collect that data.
     * @param value Value to set for the historyDefinitions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHistoryDefinitions(@javax.annotation.Nullable final java.util.List<AccessReviewHistoryDefinition> value) {
        this.historyDefinitions = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Teamwork extends Entity implements Parsable {
    /** The deletedTeams property */
    private java.util.List<DeletedTeam> deletedTeams;
    /** The workforceIntegrations property */
    private java.util.List<WorkforceIntegration> workforceIntegrations;
    /**
     * Instantiates a new Teamwork and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Teamwork() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Teamwork
     */
    @javax.annotation.Nonnull
    public static Teamwork createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Teamwork();
    }
    /**
     * Gets the deletedTeams property value. The deletedTeams property
     * @return a deletedTeam
     */
    @javax.annotation.Nullable
    public java.util.List<DeletedTeam> getDeletedTeams() {
        return this.deletedTeams;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deletedTeams", (n) -> { this.setDeletedTeams(n.getCollectionOfObjectValues(DeletedTeam::createFromDiscriminatorValue)); });
        deserializerMap.put("workforceIntegrations", (n) -> { this.setWorkforceIntegrations(n.getCollectionOfObjectValues(WorkforceIntegration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the workforceIntegrations property value. The workforceIntegrations property
     * @return a workforceIntegration
     */
    @javax.annotation.Nullable
    public java.util.List<WorkforceIntegration> getWorkforceIntegrations() {
        return this.workforceIntegrations;
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
        writer.writeCollectionOfObjectValues("deletedTeams", this.getDeletedTeams());
        writer.writeCollectionOfObjectValues("workforceIntegrations", this.getWorkforceIntegrations());
    }
    /**
     * Sets the deletedTeams property value. The deletedTeams property
     * @param value Value to set for the deletedTeams property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeletedTeams(@javax.annotation.Nullable final java.util.List<DeletedTeam> value) {
        this.deletedTeams = value;
    }
    /**
     * Sets the workforceIntegrations property value. The workforceIntegrations property
     * @param value Value to set for the workforceIntegrations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkforceIntegrations(@javax.annotation.Nullable final java.util.List<WorkforceIntegration> value) {
        this.workforceIntegrations = value;
    }
}

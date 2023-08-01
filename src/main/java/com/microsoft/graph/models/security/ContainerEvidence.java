package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContainerEvidence extends AlertEvidence implements Parsable {
    /**
     * The args property
     */
    private java.util.List<String> args;
    /**
     * The command property
     */
    private java.util.List<String> command;
    /**
     * The containerId property
     */
    private String containerId;
    /**
     * The image property
     */
    private ContainerImageEvidence image;
    /**
     * The isPrivileged property
     */
    private Boolean isPrivileged;
    /**
     * The name property
     */
    private String name;
    /**
     * The pod property
     */
    private KubernetesPodEvidence pod;
    /**
     * Instantiates a new containerEvidence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ContainerEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.containerEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a containerEvidence
     */
    @javax.annotation.Nonnull
    public static ContainerEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContainerEvidence();
    }
    /**
     * Gets the args property value. The args property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getArgs() {
        return this.args;
    }
    /**
     * Gets the command property value. The command property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCommand() {
        return this.command;
    }
    /**
     * Gets the containerId property value. The containerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContainerId() {
        return this.containerId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("args", (n) -> { this.setArgs(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("command", (n) -> { this.setCommand(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("containerId", (n) -> { this.setContainerId(n.getStringValue()); });
        deserializerMap.put("image", (n) -> { this.setImage(n.getObjectValue(ContainerImageEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("isPrivileged", (n) -> { this.setIsPrivileged(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("pod", (n) -> { this.setPod(n.getObjectValue(KubernetesPodEvidence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the image property value. The image property
     * @return a containerImageEvidence
     */
    @javax.annotation.Nullable
    public ContainerImageEvidence getImage() {
        return this.image;
    }
    /**
     * Gets the isPrivileged property value. The isPrivileged property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPrivileged() {
        return this.isPrivileged;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the pod property value. The pod property
     * @return a kubernetesPodEvidence
     */
    @javax.annotation.Nullable
    public KubernetesPodEvidence getPod() {
        return this.pod;
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
        writer.writeCollectionOfPrimitiveValues("args", this.getArgs());
        writer.writeCollectionOfPrimitiveValues("command", this.getCommand());
        writer.writeStringValue("containerId", this.getContainerId());
        writer.writeObjectValue("image", this.getImage());
        writer.writeBooleanValue("isPrivileged", this.getIsPrivileged());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("pod", this.getPod());
    }
    /**
     * Sets the args property value. The args property
     * @param value Value to set for the args property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArgs(@javax.annotation.Nullable final java.util.List<String> value) {
        this.args = value;
    }
    /**
     * Sets the command property value. The command property
     * @param value Value to set for the command property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCommand(@javax.annotation.Nullable final java.util.List<String> value) {
        this.command = value;
    }
    /**
     * Sets the containerId property value. The containerId property
     * @param value Value to set for the containerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContainerId(@javax.annotation.Nullable final String value) {
        this.containerId = value;
    }
    /**
     * Sets the image property value. The image property
     * @param value Value to set for the image property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImage(@javax.annotation.Nullable final ContainerImageEvidence value) {
        this.image = value;
    }
    /**
     * Sets the isPrivileged property value. The isPrivileged property
     * @param value Value to set for the isPrivileged property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPrivileged(@javax.annotation.Nullable final Boolean value) {
        this.isPrivileged = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the pod property value. The pod property
     * @param value Value to set for the pod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPod(@javax.annotation.Nullable final KubernetesPodEvidence value) {
        this.pod = value;
    }
}

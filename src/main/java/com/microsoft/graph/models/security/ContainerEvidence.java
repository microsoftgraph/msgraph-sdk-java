package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContainerEvidence extends AlertEvidence implements Parsable {
    /**
     * The list of arguments.
     */
    private java.util.List<String> args;
    /**
     * The list of commands.
     */
    private java.util.List<String> command;
    /**
     * The container ID.
     */
    private String containerId;
    /**
     * The image used to run the container.
     */
    private ContainerImageEvidence image;
    /**
     * The privileged status.
     */
    private Boolean isPrivileged;
    /**
     * The container name.
     */
    private String name;
    /**
     * The pod this container belongs to.
     */
    private KubernetesPodEvidence pod;
    /**
     * Instantiates a new containerEvidence and sets the default values.
     */
    public ContainerEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.containerEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a containerEvidence
     */
    @jakarta.annotation.Nonnull
    public static ContainerEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContainerEvidence();
    }
    /**
     * Gets the args property value. The list of arguments.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getArgs() {
        return this.args;
    }
    /**
     * Gets the command property value. The list of commands.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCommand() {
        return this.command;
    }
    /**
     * Gets the containerId property value. The container ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContainerId() {
        return this.containerId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the image property value. The image used to run the container.
     * @return a containerImageEvidence
     */
    @jakarta.annotation.Nullable
    public ContainerImageEvidence getImage() {
        return this.image;
    }
    /**
     * Gets the isPrivileged property value. The privileged status.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPrivileged() {
        return this.isPrivileged;
    }
    /**
     * Gets the name property value. The container name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the pod property value. The pod this container belongs to.
     * @return a kubernetesPodEvidence
     */
    @jakarta.annotation.Nullable
    public KubernetesPodEvidence getPod() {
        return this.pod;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the args property value. The list of arguments.
     * @param value Value to set for the args property.
     */
    public void setArgs(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.args = value;
    }
    /**
     * Sets the command property value. The list of commands.
     * @param value Value to set for the command property.
     */
    public void setCommand(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.command = value;
    }
    /**
     * Sets the containerId property value. The container ID.
     * @param value Value to set for the containerId property.
     */
    public void setContainerId(@jakarta.annotation.Nullable final String value) {
        this.containerId = value;
    }
    /**
     * Sets the image property value. The image used to run the container.
     * @param value Value to set for the image property.
     */
    public void setImage(@jakarta.annotation.Nullable final ContainerImageEvidence value) {
        this.image = value;
    }
    /**
     * Sets the isPrivileged property value. The privileged status.
     * @param value Value to set for the isPrivileged property.
     */
    public void setIsPrivileged(@jakarta.annotation.Nullable final Boolean value) {
        this.isPrivileged = value;
    }
    /**
     * Sets the name property value. The container name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the pod property value. The pod this container belongs to.
     * @param value Value to set for the pod property.
     */
    public void setPod(@jakarta.annotation.Nullable final KubernetesPodEvidence value) {
        this.pod = value;
    }
}

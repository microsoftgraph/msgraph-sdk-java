package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EBookInstallSummary extends Entity implements Parsable {
    /** Number of Devices that have failed to install this book. */
    private Integer _failedDeviceCount;
    /** Number of Users that have 1 or more device that failed to install this book. */
    private Integer _failedUserCount;
    /** Number of Devices that have successfully installed this book. */
    private Integer _installedDeviceCount;
    /** Number of Users whose devices have all succeeded to install this book. */
    private Integer _installedUserCount;
    /** Number of Devices that does not have this book installed. */
    private Integer _notInstalledDeviceCount;
    /** Number of Users that did not install this book. */
    private Integer _notInstalledUserCount;
    /**
     * Instantiates a new eBookInstallSummary and sets the default values.
     * @return a void
     */
    public EBookInstallSummary() {
        super();
        this.setOdataType("#microsoft.graph.eBookInstallSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a eBookInstallSummary
     */
    @javax.annotation.Nonnull
    public static EBookInstallSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EBookInstallSummary();
    }
    /**
     * Gets the failedDeviceCount property value. Number of Devices that have failed to install this book.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this._failedDeviceCount;
    }
    /**
     * Gets the failedUserCount property value. Number of Users that have 1 or more device that failed to install this book.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedUserCount() {
        return this._failedUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EBookInstallSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("failedDeviceCount", (n) -> { currentObject.setFailedDeviceCount(n.getIntegerValue()); });
            this.put("failedUserCount", (n) -> { currentObject.setFailedUserCount(n.getIntegerValue()); });
            this.put("installedDeviceCount", (n) -> { currentObject.setInstalledDeviceCount(n.getIntegerValue()); });
            this.put("installedUserCount", (n) -> { currentObject.setInstalledUserCount(n.getIntegerValue()); });
            this.put("notInstalledDeviceCount", (n) -> { currentObject.setNotInstalledDeviceCount(n.getIntegerValue()); });
            this.put("notInstalledUserCount", (n) -> { currentObject.setNotInstalledUserCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the installedDeviceCount property value. Number of Devices that have successfully installed this book.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstalledDeviceCount() {
        return this._installedDeviceCount;
    }
    /**
     * Gets the installedUserCount property value. Number of Users whose devices have all succeeded to install this book.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstalledUserCount() {
        return this._installedUserCount;
    }
    /**
     * Gets the notInstalledDeviceCount property value. Number of Devices that does not have this book installed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotInstalledDeviceCount() {
        return this._notInstalledDeviceCount;
    }
    /**
     * Gets the notInstalledUserCount property value. Number of Users that did not install this book.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNotInstalledUserCount() {
        return this._notInstalledUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeIntegerValue("failedUserCount", this.getFailedUserCount());
        writer.writeIntegerValue("installedDeviceCount", this.getInstalledDeviceCount());
        writer.writeIntegerValue("installedUserCount", this.getInstalledUserCount());
        writer.writeIntegerValue("notInstalledDeviceCount", this.getNotInstalledDeviceCount());
        writer.writeIntegerValue("notInstalledUserCount", this.getNotInstalledUserCount());
    }
    /**
     * Sets the failedDeviceCount property value. Number of Devices that have failed to install this book.
     * @param value Value to set for the failedDeviceCount property.
     * @return a void
     */
    public void setFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._failedDeviceCount = value;
    }
    /**
     * Sets the failedUserCount property value. Number of Users that have 1 or more device that failed to install this book.
     * @param value Value to set for the failedUserCount property.
     * @return a void
     */
    public void setFailedUserCount(@javax.annotation.Nullable final Integer value) {
        this._failedUserCount = value;
    }
    /**
     * Sets the installedDeviceCount property value. Number of Devices that have successfully installed this book.
     * @param value Value to set for the installedDeviceCount property.
     * @return a void
     */
    public void setInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._installedDeviceCount = value;
    }
    /**
     * Sets the installedUserCount property value. Number of Users whose devices have all succeeded to install this book.
     * @param value Value to set for the installedUserCount property.
     * @return a void
     */
    public void setInstalledUserCount(@javax.annotation.Nullable final Integer value) {
        this._installedUserCount = value;
    }
    /**
     * Sets the notInstalledDeviceCount property value. Number of Devices that does not have this book installed.
     * @param value Value to set for the notInstalledDeviceCount property.
     * @return a void
     */
    public void setNotInstalledDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._notInstalledDeviceCount = value;
    }
    /**
     * Sets the notInstalledUserCount property value. Number of Users that did not install this book.
     * @param value Value to set for the notInstalledUserCount property.
     * @return a void
     */
    public void setNotInstalledUserCount(@javax.annotation.Nullable final Integer value) {
        this._notInstalledUserCount = value;
    }
}

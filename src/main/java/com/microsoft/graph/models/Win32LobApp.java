package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Win32 apps.
 */
public class Win32LobApp extends MobileLobApp implements Parsable {
    /**
     * Contains properties for Windows architecture.
     */
    private WindowsArchitecture applicableArchitectures;
    /**
     * The command line to install this app
     */
    private String installCommandLine;
    /**
     * The install experience for this app.
     */
    private Win32LobAppInstallExperience installExperience;
    /**
     * The value for the minimum CPU speed which is required to install this app.
     */
    private Integer minimumCpuSpeedInMHz;
    /**
     * The value for the minimum free disk space which is required to install this app.
     */
    private Integer minimumFreeDiskSpaceInMB;
    /**
     * The value for the minimum physical memory which is required to install this app.
     */
    private Integer minimumMemoryInMB;
    /**
     * The value for the minimum number of processors which is required to install this app.
     */
    private Integer minimumNumberOfProcessors;
    /**
     * The value for the minimum supported windows release.
     */
    private String minimumSupportedWindowsRelease;
    /**
     * The MSI details if this Win32 app is an MSI app.
     */
    private Win32LobAppMsiInformation msiInformation;
    /**
     * The return codes for post installation behavior.
     */
    private java.util.List<Win32LobAppReturnCode> returnCodes;
    /**
     * The detection and requirement rules for this app.
     */
    private java.util.List<Win32LobAppRule> rules;
    /**
     * The relative path of the setup file in the encrypted Win32LobApp package.
     */
    private String setupFilePath;
    /**
     * The command line to uninstall this app
     */
    private String uninstallCommandLine;
    /**
     * Instantiates a new win32LobApp and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Win32LobApp() {
        super();
        this.setOdataType("#microsoft.graph.win32LobApp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobApp
     */
    @javax.annotation.Nonnull
    public static Win32LobApp createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobApp();
    }
    /**
     * Gets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @return a windowsArchitecture
     */
    @javax.annotation.Nullable
    public WindowsArchitecture getApplicableArchitectures() {
        return this.applicableArchitectures;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableArchitectures", (n) -> { this.setApplicableArchitectures(n.getEnumValue(WindowsArchitecture.class)); });
        deserializerMap.put("installCommandLine", (n) -> { this.setInstallCommandLine(n.getStringValue()); });
        deserializerMap.put("installExperience", (n) -> { this.setInstallExperience(n.getObjectValue(Win32LobAppInstallExperience::createFromDiscriminatorValue)); });
        deserializerMap.put("minimumCpuSpeedInMHz", (n) -> { this.setMinimumCpuSpeedInMHz(n.getIntegerValue()); });
        deserializerMap.put("minimumFreeDiskSpaceInMB", (n) -> { this.setMinimumFreeDiskSpaceInMB(n.getIntegerValue()); });
        deserializerMap.put("minimumMemoryInMB", (n) -> { this.setMinimumMemoryInMB(n.getIntegerValue()); });
        deserializerMap.put("minimumNumberOfProcessors", (n) -> { this.setMinimumNumberOfProcessors(n.getIntegerValue()); });
        deserializerMap.put("minimumSupportedWindowsRelease", (n) -> { this.setMinimumSupportedWindowsRelease(n.getStringValue()); });
        deserializerMap.put("msiInformation", (n) -> { this.setMsiInformation(n.getObjectValue(Win32LobAppMsiInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("returnCodes", (n) -> { this.setReturnCodes(n.getCollectionOfObjectValues(Win32LobAppReturnCode::createFromDiscriminatorValue)); });
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(Win32LobAppRule::createFromDiscriminatorValue)); });
        deserializerMap.put("setupFilePath", (n) -> { this.setSetupFilePath(n.getStringValue()); });
        deserializerMap.put("uninstallCommandLine", (n) -> { this.setUninstallCommandLine(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the installCommandLine property value. The command line to install this app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInstallCommandLine() {
        return this.installCommandLine;
    }
    /**
     * Gets the installExperience property value. The install experience for this app.
     * @return a win32LobAppInstallExperience
     */
    @javax.annotation.Nullable
    public Win32LobAppInstallExperience getInstallExperience() {
        return this.installExperience;
    }
    /**
     * Gets the minimumCpuSpeedInMHz property value. The value for the minimum CPU speed which is required to install this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumCpuSpeedInMHz() {
        return this.minimumCpuSpeedInMHz;
    }
    /**
     * Gets the minimumFreeDiskSpaceInMB property value. The value for the minimum free disk space which is required to install this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumFreeDiskSpaceInMB() {
        return this.minimumFreeDiskSpaceInMB;
    }
    /**
     * Gets the minimumMemoryInMB property value. The value for the minimum physical memory which is required to install this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumMemoryInMB() {
        return this.minimumMemoryInMB;
    }
    /**
     * Gets the minimumNumberOfProcessors property value. The value for the minimum number of processors which is required to install this app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumNumberOfProcessors() {
        return this.minimumNumberOfProcessors;
    }
    /**
     * Gets the minimumSupportedWindowsRelease property value. The value for the minimum supported windows release.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumSupportedWindowsRelease() {
        return this.minimumSupportedWindowsRelease;
    }
    /**
     * Gets the msiInformation property value. The MSI details if this Win32 app is an MSI app.
     * @return a win32LobAppMsiInformation
     */
    @javax.annotation.Nullable
    public Win32LobAppMsiInformation getMsiInformation() {
        return this.msiInformation;
    }
    /**
     * Gets the returnCodes property value. The return codes for post installation behavior.
     * @return a win32LobAppReturnCode
     */
    @javax.annotation.Nullable
    public java.util.List<Win32LobAppReturnCode> getReturnCodes() {
        return this.returnCodes;
    }
    /**
     * Gets the rules property value. The detection and requirement rules for this app.
     * @return a win32LobAppRule
     */
    @javax.annotation.Nullable
    public java.util.List<Win32LobAppRule> getRules() {
        return this.rules;
    }
    /**
     * Gets the setupFilePath property value. The relative path of the setup file in the encrypted Win32LobApp package.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSetupFilePath() {
        return this.setupFilePath;
    }
    /**
     * Gets the uninstallCommandLine property value. The command line to uninstall this app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUninstallCommandLine() {
        return this.uninstallCommandLine;
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
        writer.writeEnumValue("applicableArchitectures", this.getApplicableArchitectures());
        writer.writeStringValue("installCommandLine", this.getInstallCommandLine());
        writer.writeObjectValue("installExperience", this.getInstallExperience());
        writer.writeIntegerValue("minimumCpuSpeedInMHz", this.getMinimumCpuSpeedInMHz());
        writer.writeIntegerValue("minimumFreeDiskSpaceInMB", this.getMinimumFreeDiskSpaceInMB());
        writer.writeIntegerValue("minimumMemoryInMB", this.getMinimumMemoryInMB());
        writer.writeIntegerValue("minimumNumberOfProcessors", this.getMinimumNumberOfProcessors());
        writer.writeStringValue("minimumSupportedWindowsRelease", this.getMinimumSupportedWindowsRelease());
        writer.writeObjectValue("msiInformation", this.getMsiInformation());
        writer.writeCollectionOfObjectValues("returnCodes", this.getReturnCodes());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
        writer.writeStringValue("setupFilePath", this.getSetupFilePath());
        writer.writeStringValue("uninstallCommandLine", this.getUninstallCommandLine());
    }
    /**
     * Sets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @param value Value to set for the applicableArchitectures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicableArchitectures(@javax.annotation.Nullable final WindowsArchitecture value) {
        this.applicableArchitectures = value;
    }
    /**
     * Sets the installCommandLine property value. The command line to install this app
     * @param value Value to set for the installCommandLine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallCommandLine(@javax.annotation.Nullable final String value) {
        this.installCommandLine = value;
    }
    /**
     * Sets the installExperience property value. The install experience for this app.
     * @param value Value to set for the installExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInstallExperience(@javax.annotation.Nullable final Win32LobAppInstallExperience value) {
        this.installExperience = value;
    }
    /**
     * Sets the minimumCpuSpeedInMHz property value. The value for the minimum CPU speed which is required to install this app.
     * @param value Value to set for the minimumCpuSpeedInMHz property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumCpuSpeedInMHz(@javax.annotation.Nullable final Integer value) {
        this.minimumCpuSpeedInMHz = value;
    }
    /**
     * Sets the minimumFreeDiskSpaceInMB property value. The value for the minimum free disk space which is required to install this app.
     * @param value Value to set for the minimumFreeDiskSpaceInMB property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumFreeDiskSpaceInMB(@javax.annotation.Nullable final Integer value) {
        this.minimumFreeDiskSpaceInMB = value;
    }
    /**
     * Sets the minimumMemoryInMB property value. The value for the minimum physical memory which is required to install this app.
     * @param value Value to set for the minimumMemoryInMB property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumMemoryInMB(@javax.annotation.Nullable final Integer value) {
        this.minimumMemoryInMB = value;
    }
    /**
     * Sets the minimumNumberOfProcessors property value. The value for the minimum number of processors which is required to install this app.
     * @param value Value to set for the minimumNumberOfProcessors property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumNumberOfProcessors(@javax.annotation.Nullable final Integer value) {
        this.minimumNumberOfProcessors = value;
    }
    /**
     * Sets the minimumSupportedWindowsRelease property value. The value for the minimum supported windows release.
     * @param value Value to set for the minimumSupportedWindowsRelease property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedWindowsRelease(@javax.annotation.Nullable final String value) {
        this.minimumSupportedWindowsRelease = value;
    }
    /**
     * Sets the msiInformation property value. The MSI details if this Win32 app is an MSI app.
     * @param value Value to set for the msiInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMsiInformation(@javax.annotation.Nullable final Win32LobAppMsiInformation value) {
        this.msiInformation = value;
    }
    /**
     * Sets the returnCodes property value. The return codes for post installation behavior.
     * @param value Value to set for the returnCodes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReturnCodes(@javax.annotation.Nullable final java.util.List<Win32LobAppReturnCode> value) {
        this.returnCodes = value;
    }
    /**
     * Sets the rules property value. The detection and requirement rules for this app.
     * @param value Value to set for the rules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRules(@javax.annotation.Nullable final java.util.List<Win32LobAppRule> value) {
        this.rules = value;
    }
    /**
     * Sets the setupFilePath property value. The relative path of the setup file in the encrypted Win32LobApp package.
     * @param value Value to set for the setupFilePath property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSetupFilePath(@javax.annotation.Nullable final String value) {
        this.setupFilePath = value;
    }
    /**
     * Sets the uninstallCommandLine property value. The command line to uninstall this app
     * @param value Value to set for the uninstallCommandLine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUninstallCommandLine(@javax.annotation.Nullable final String value) {
        this.uninstallCommandLine = value;
    }
}

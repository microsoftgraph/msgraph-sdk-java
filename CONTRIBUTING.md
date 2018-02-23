
# Contributing to the Microsoft Graph SDK for Java

The Microsoft Graph SDK is available for all manner of contribution. There are a couple of different recommended paths to get contributions into the released version of this SDK.

__NOTE__ A signed a contribution license agreement is required for all contributions, and is checked automatically on new pull requests. Please read and sign the agreement https://cla.microsoft.com/ before starting any work for this repository.

## File issues

The best way to get started with a contribution is to start a dialog with the owners of this repository. Sometimes features will be under development or out of scope for this SDK and it's best to check before starting work on contribution.

## Submit pull requests for trivial changes

If you are making a change that does not affect the interface components and does not affect other downstream callers, feel free to make a pull request against the __dev__ branch.  The dev branch will be updated frequently.

Revisions of this nature will result in a 0.0.X change of the version number.

## Submit pull requests for features

If major functionality is being added, or there will need to be gestation time for a change, it should be submitted against the __feature__ branch.

Revisions of this nature will result in a 0.X.X change of the version number.

## Submit pull requests for model or request files
You can revise code in the extension folders of these folders. See [Extending the Library](https://github.com/microsoftgraph/msgraph-sdk-java/wiki/Extending-the-Library) for more information on how to work with the generated parts of the library.

## Add yourself as a contributor

This project follows the [all contributors](https://github.com/kentcdodds/all-contributors) specification. When making a contribution, please add yourself to the table of contributors:

 1. In section 7. of the [README.md](https://github.com/microsoftgraph/msgraph-sdk-java/blob/master/README.md), after the last "|", copy and paste a new blank contributor element
    ```html
    [<img src="https://avatars.githubusercontent.com/u/<your-uid>?v=4" width="100px;"/><br />
    <sub><b>Your Name</b></sub>](your website or github page)<br />
    [emoji](link "alt-text") |
    ```

    You can get your GitHub UID by inspecting your GitHub avatar image.

2. For each contribution type (see [emoji key](https://github.com/kentcdodds/all-contributors#emoji-key) for a list of contribution types), add an emoji and a relevant link and alt-text.
    
    For example, if you write a blogpost on how to use the SDK, you would include:
    
	```html
	    [📝]("https://myblog.com/using-the-java-sdk" "Blog Post")
	```

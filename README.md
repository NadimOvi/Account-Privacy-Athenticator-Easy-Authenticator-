#  easyauthenticator -  Android OTP Authenticator

easyauthenticator is a two-factor authentication App for Android 5.1+.

It implements Time-based One-time Passwords (TOTP) and HMAC-Based One-Time Passwords (HOTP).
Simply scan the QR code and login with the generated 6-digit code.



## Features:

 * Free and Open-Source
 * Requires minimal permissions
   - Camera access for QR code scanning
   - Storage access for import and export of the database
 * Encrypted storage with two backends:
   - Android KeyStore
   - Password / PIN
 * Multiple backup options:
   - Plain-text
   - Password-protected
   - OpenPGP-encrypted
 * Sleek minimalistic Material Design with three different themes:
   - Light
   - Dark
   - Black (for OLED screens)
 * Great Usability
 * Compatible with Google Authenticator
 * Supported algorithms:
   - TOTP (Time-based One-time Passwords) as specified in [RFC 6238](https://tools.ietf.org/html/rfc6238)
   - HOTP (HMAC-based One-time Passwords) as specified in [RFC 4226](https://tools.ietf.org/html/rfc4226)

## Backups:

To keep your account information as secure as possible easyauthenticator only stores it in
encrypted data files. A part of the encryption key used for that is stored in the
Android KeyStore system. The advantage of this approach is that the key is kept
separate from the apps data and, as a bonus, can be backed by hardware cryptography
(if your device supports this).

However, due to that separation, backups with 3rd-party apps like Titanium Backup can not
be used with easyauthenticator. Such apps only backup the encrypted data files and not the encryption
key, which renders them useless.

**Please only use the internal backup functions provided by easyauthenticator to backup your accounts!**
**Everything else WILL result in data loss.**


### Automatic backups:

 * BroadcastReceivers: easyauthenticator supports a number of broadcasts to perform automated backups, eg. via Tasker. These will get saved to the defined backup directory. **These only work when KeyStore is used as the encryption mechanism**
   - **org.shadowice.flocke.easyauthenticator.broadcast.PLAIN_TEXT_BACKUP**: Perform a plain text backup. **WARNING**: This will save your 2FA tokens onto the disk in an unencrypted manner!
   - **org.shadowice.flocke.easyauthenticator.broadcast.ENCRYPTED_BACKUP**: Perform an encrypted backup of your 2FA database using the selected password in settings.



## Screenshots:
#### Light theme:

[<img width=200 alt="Main Activity" src="https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/main_activity.png">](https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/main_activity.png)
[<img width=200 alt="Settings Activity" src="https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/settings_activity.png">](https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/settings_activity.png)
[<img width=200 alt="Backup Activity" src="https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/backup_activity.png">](https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/backup_activity.png)

#### Dark theme:

[<img width=200 alt="Main Activity" src="https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/main_activity_dark.png">](https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/main_activity_dark.png)
[<img width=200 alt="Settings Activity" src="https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/settings_activity_dark.png">](https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/settings_activity_dark.png)
[<img width=200 alt="Backup Activity" src="https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/backup_activity_dark.png">](https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/backup_activity_dark.png)

#### Black theme:

[<img width=200 alt="Main Activity" src="https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/main_activity_black.png">](https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/main_activity_black.png)
[<img width=200 alt="Settings Activity" src="https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/settings_activity_black.png">](https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/settings_activity_black.png)
[<img width=200 alt="Backup Activity" src="https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/backup_activity_black.png">](https://raw.githubusercontent.com/flocke/easyauthenticator/master/assets/screenshots/backup_activity_black.png)

## Acknowledgments:
#### Open-source components used:

 * [AboutLibraries](https://github.com/mikepenz/AboutLibraries)
 * [Apache Commons Codec](https://commons.apache.org/proper/commons-codec/)
 * [Expandable Layout](https://github.com/AAkira/ExpandableLayout)
 * [Floating Action Button Speed Dial](https://github.com/leinardi/FloatingActionButtonSpeedDial)
 * [material-intro](https://github.com/heinrichreimer/material-intro)
 * [MaterialProgressBar](https://github.com/DreaminginCodeZH/MaterialProgressBar)
 * [OpenPGP API library](https://github.com/open-keychain/openpgp-api)
 * [VNTNumberPickerPreference](https://github.com/vanniktech/VNTNumberPickerPreference)
 * [ZXing Android Embedded](https://github.com/journeyapps/zxing-android-embedded)

#### Code examples used:

 * [Android-ItemTouchHelper-Demo](https://github.com/iPaulPro/Android-ItemTouchHelper-Demo/tree/master/app/src/main/java/co/paulburke/android/itemtouchhelperdemo/helper)
 * [Code Parts from Google's Android Samples](https://android.googlesource.com/platform/development/+/master/samples/Vault/src/com/example/android/vault)
 * [LetterBitmap](https://stackoverflow.com/questions/23122088/colored-boxed-with-letters-a-la-gmail)
 * [DimensionConverter](https://stackoverflow.com/questions/8343971/how-to-parse-a-dimension-string-and-convert-it-to-a-dimension-value)

#### Previously used open-source components:

 * [FABsMenu](https://github.com/jahirfiquitiva/FABsMenu)
 * [LicensesDialog](https://github.com/PSDev/LicensesDialog)

#### Previously used code examples:

 * [FloatingActionMenuAndroid](https://github.com/pmahsky/FloatingActionMenuAndroid)

## License:
```
Copyright (C) 2017-2020 Jakob Nixdorf <easyauthenticator@shadowice.org>
Copyright (C) 2015 Bruno Bierbaumer

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in the
Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
OR OTHER DEALINGS IN THE SOFTWARE.
```

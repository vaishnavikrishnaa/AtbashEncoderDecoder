# 🔐 Encoder-Decoder (Atbash Cipher) - Java Project

This is a simple Java console application that allows users to encode and decode text using the **Atbash Cipher**.

The Atbash Cipher is a type of monoalphabetic substitution cipher in which each letter of the alphabet is mapped to its reverse counterpart. For example:
- `A ↔ Z`
- `B ↔ Y`
- `C ↔ X`, and so on.

---

## 🛠 Features

- ✅ Encode a message using Atbash cipher
- ✅ Decode a message using the same logic
- ✅ Accepts both uppercase and lowercase letters
- ✅ Ignores non-alphabetic characters (they remain unchanged)
- ✅ Uses recursion for both encoding and decoding

---

## 💻 How It Works

1. The user is prompted to choose between encoding or decoding.
2. The user enters a string.
3. The program processes the string character by character using recursion.
4. The encoded or decoded result is displayed.

---

## 📦 Example

```bash
Welcome to Encoder-Decoder game!
1.Encode a String
2.Decode a String
Choose an option (1 or 2): 
1
Enter a String: 
Hello
EncodedString: Svool

# Bitmap Transformer

The Bitmap Transformer is a Java program that allows you to perform various transformations on bitmap images. It provides a command-line interface to apply different transformations and save the modified image to a new file.

## Supported Transforms

### 1. Convert Image to Grayscale

Converts the colors of the image to grayscale, producing a black-and-white version of the original image. Each pixel's color intensity is averaged to create a grayscale value.

Command to apply the transform:
```
./gradlew run --args 'app/src/main/resources/[imageName] app/src/main/resources/[newImageName] convertImageToGray'
```

### 2. Mirror Image Horizontally

Flips the image horizontally along its vertical axis, creating a mirror image effect from left to right.

Command to apply the transform:
```
./gradlew run --args 'app/src/main/resources/[imageName] app/src/main/resources/[newImageName] mirrorImageHorizontally
```

### 3. Mirror Image Vertically

Flips the image vertically along its horizontal axis, creating a mirror image effect from top to bottom.

Command to apply the transform:
```
./gradlew run --args 'app/src/main/resources/[imageName] app/src/main/resources/[newImageName] mirrorImageVertically
```

## Getting Started

1. Clone this repository to your local machine.
2. Build the project using Gradle: ./gradlew build

## Usage

- `inputFilePath`: Path to the input bitmap image file.
- `outputFilePath`: Path to save the transformed image.
- Transform: Choose one of the supported transforms: `convertImageToGray`, `mirrorImageHorizontally`, or `mirrorImageVertically`.

## Example

Convert an image to grayscale:
```
./gradlew run --args 'app/src/main/resources/imageBmp.bmp app/src/main/resources/newImage.bmp convertImageToGray

```

## Acknowledgments

- This project was inspired by the need to apply simple bitmap image transformations.
- Special thanks to the creators and maintainers of Java, Gradle, and the Java ImageIO library.

import clipboard

filename = input("Enter the File Name : ").replace(".", "").split(" ")
fileno = filename[0]
filename.remove(fileno)
filename.append(fileno)

clipboard.copy('_'.join(filename))
print("Copied to Clipboard")
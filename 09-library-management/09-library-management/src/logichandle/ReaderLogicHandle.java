package logichandle;

import entity.Reader;
import java.util.Scanner;

public class ReaderLogicHandle {

  private final Reader[] readers = new Reader[1000]; // Danh sách bạn đọc có trong thư viện

  public int getReadersLength() {
    return readers.length;
  }


  public void printReaders() {
    for (int i = 0; i < readers.length; i++) {
      if (readers[i] == null) {      // băng null thì bỏ qua
        continue;
      }
      System.out.println(readers[i]); // không bằng null in ra
    }
  }

  public void inputNewReader() {
    System.out.println("Nhập số lượng bạn đọc muốn đăng ký tài khoản tại thư viện: ");
    int readerNumber = new Scanner(System.in).nextInt();
    for (int i = 0; i < readerNumber; i++) {
      System.out.println("Nhập thông tin cho bạn đọc thứ " + (i + 1));
      Reader reader = new Reader();
      reader.inputInfo();

      // Lưu bạn đọc
      saveReader(reader);
    }
  }

  public void saveReader(Reader reader) {
//    for (int j = 0; j < readers.length;
//        j++) { // duyệt từ đầu đến cuối mảng (length), chỗ nào trống (null) thì điền sách vào
//      if (readers[j] == null) {
//        readers[j] = reader;
//        break;
//      }
//    }
    for (int j = 0; j < readers.length;
        j++) { // duyệt từ đầu đến cuối mảng (length), phần tử trong mảng không phải là null thì tiếp tục với phần tử tiếp theo
      if (readers[j] != null) {
        continue;
      }
      readers[j] = reader; // Ngược lại, nếu phần tử đó là null, thì gán giá trị của biến "reader" vào phần tử đó và thoát khỏi vòng lặp bằng cách sử dụng lệnh "break". Điều này giúp đưa dữ liệu vào vị trí trống đầu tiên trong mảng "readers".
      break;
    }
  }

  public boolean CheckCoBanDocHayChua() {
    boolean coBanDocHayChua = false;
    for (int i = 0; i < readers.length; i++) {
      if (readers[i] != null) {
        coBanDocHayChua = true;
        break;
      }
    }
    return coBanDocHayChua;
  }

  public Reader searchReaderById(int readerId) {
    for (int j = 0; j < readers.length; j++) {
      if (readers[j] != null && readerId == readers[j].getId()) {
        return readers[j];
      }
    }
    return null;
  }

}

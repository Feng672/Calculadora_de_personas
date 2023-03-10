package com.example.demo;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javax.swing.*;

import java.net.URL;
import java.util.ResourceBundle;


public class CalculatorController implements Initializable {
    /**
     * Serie de variables globales para las distintas funciones
     */
    Persona objeto;
    Persona objeto2;
    Persona objeto3;
    Persona objeto4;
    Integer n = 1;

    @FXML
    private ComboBox<String> cbPersona1;

    @FXML
    private ComboBox<String> cbPersona2;

    @FXML
    private ComboBox<String> cbProvincia;

    @FXML
    private Label lResultado;

    @FXML
    private TextField tfEdad;

    @FXML
    private TextField tfNombre;

    /**
     * Cuando el botón es presionado comenzará una serie de if para validar la información requerida y la información que se acepta se almacena en una clase como una nueva instancia y se agrega a los combo box de operaciones
     * @param event
     */
    @FXML
    void btnAgregarPersonas(ActionEvent event) {
        if (tfEdad.getText() != null && tfEdad.getText().matches("[0-9]+") == false){
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Solo se permiten enteros en el campo de edad");
        }else if(tfEdad.getText() == null || tfNombre.getText() == null || cbProvincia.getValue() == null) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Faltan datos");
        }else if (n==1) {
            objeto = new Persona(tfNombre.getText(), Integer.parseInt(tfEdad.getText()), cbProvincia.getValue());
            cbPersona1.getItems().add(objeto.Nombre);
            cbPersona2.getItems().add(objeto.Nombre);
            n++;
        }else if (n==2) {
            objeto2 = new Persona(tfNombre.getText(), Integer.parseInt(tfEdad.getText()), cbProvincia.getValue());
            cbPersona1.getItems().add(objeto2.Nombre);
            cbPersona2.getItems().add(objeto2.Nombre);
            n++;
        }else if (n==3) {
            objeto3 = new Persona(tfNombre.getText(), Integer.parseInt(tfEdad.getText()), cbProvincia.getValue());
            cbPersona1.getItems().add(objeto3.Nombre);
            cbPersona2.getItems().add(objeto3.Nombre);
            n++;
        }else if (n==4){
            objeto4 = new Persona(tfNombre.getText(), Integer.parseInt(tfEdad.getText()), cbProvincia.getValue());
            cbPersona1.getItems().add(objeto4.Nombre);
            cbPersona2.getItems().add(objeto4.Nombre);
            n++;
        }else if (n==5){
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Ya hay 4 personas");
        } else {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Hay algún error");
        }
    }

    /**
     * Botón que al ser presionado realiza la división entre las edades de las personas seleccionadas o muestra un cuadro de texto de que hay algún campo vacío
     * @param event
     */
    @FXML
    void btnDividir(ActionEvent event) {
        Boolean Estado1 = false;
        Boolean Estado2 = false;
        Integer m = 1;
        Integer o = 1;
        Integer x = 0;
        Integer y = 0;
        if (cbPersona1.getValue() == null || cbPersona2.getValue() == null) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Hay algún campo vacío");
        } else {
            while (Estado1 != true) {
                if (m == 1) {
                    if (cbPersona1.getValue() == objeto.Nombre) {
                        x = objeto.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else if (m == 2) {
                    if (cbPersona1.getValue() == objeto2.Nombre) {
                        x = objeto2.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else if (m == 3) {
                    if (cbPersona1.getValue() == objeto3.Nombre) {
                        x = objeto3.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else {
                    x = objeto4.Edad;
                    Estado1 = true;
                }
            }
            while (Estado2 != true) {
                if (o == 1) {
                    if (cbPersona2.getValue() == objeto.Nombre) {
                        y = objeto.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else if (o == 2) {
                    if (cbPersona2.getValue() == objeto2.Nombre) {
                        y = objeto2.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else if (o == 3) {
                    if (cbPersona2.getValue() == objeto3.Nombre) {
                        y = objeto3.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else {
                    y = objeto4.Edad;
                    Estado2 = true;
                }
            }
        }
        Integer z = x / y;
        lResultado.setText("Resultado: " + z);


    }

    /**
     * Botón que al ser presionado multiplica las edades de las personas seleccionadas o muestra un cuadro de texto de que hay algún campo vacío
     * @param event
     */
    @FXML
    void btnMultiplicar(ActionEvent event) {
        Boolean Estado1 = false;
        Boolean Estado2 = false;
        Integer m = 1;
        Integer o = 1;
        Integer x = 0;
        Integer y = 0;
        if (cbPersona1.getValue() == null || cbPersona2.getValue() == null) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Hay algún campo vacío");
        } else {
            while (Estado1 != true) {
                if (m == 1) {
                    if (cbPersona1.getValue() == objeto.Nombre) {
                        x = objeto.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else if (m == 2) {
                    if (cbPersona1.getValue() == objeto2.Nombre) {
                        x = objeto2.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else if (m == 3) {
                    if (cbPersona1.getValue() == objeto3.Nombre) {
                        x = objeto3.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else {
                    x = objeto4.Edad;
                    Estado1 = true;
                }
            }
            while (Estado2 != true) {
                if (o == 1) {
                    if (cbPersona2.getValue() == objeto.Nombre) {
                        y = objeto.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else if (o == 2) {
                    if (cbPersona2.getValue() == objeto2.Nombre) {
                        y = objeto2.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else if (o == 3) {
                    if (cbPersona2.getValue() == objeto3.Nombre) {
                        y = objeto3.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else {
                    y = objeto4.Edad;
                    Estado2 = true;
                }
            }
        }
        Integer z = x * y;
        lResultado.setText("Resultado: " + z);
    }

    /**
     * Botón que al ser presionado sirve para restar las edades de las personas seleccionadas o mostrar un cuadro de texto mencionando que hay algún campo vacío
     * @param event
     */
    @FXML
    void btnRestar(ActionEvent event) {
        Boolean Estado1 = false;
        Boolean Estado2 = false;
        Integer m = 1;
        Integer o = 1;
        Integer x = 0;
        Integer y = 0;
        if (cbPersona1.getValue() == null || cbPersona2.getValue() == null) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Hay algún campo vacío");
        } else {
            while (Estado1 != true) {
                if (m == 1) {
                    if (cbPersona1.getValue() == objeto.Nombre) {
                        x = objeto.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else if (m == 2) {
                    if (cbPersona1.getValue() == objeto2.Nombre) {
                        x = objeto2.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else if (m == 3) {
                    if (cbPersona1.getValue() == objeto3.Nombre) {
                        x = objeto3.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else {
                    x = objeto4.Edad;
                    Estado1 = true;
                }
            }
            while (Estado2 != true) {
                if (o == 1) {
                    if (cbPersona2.getValue() == objeto.Nombre) {
                        y = objeto.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else if (o == 2) {
                    if (cbPersona2.getValue() == objeto2.Nombre) {
                        y = objeto2.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else if (o == 3) {
                    if (cbPersona2.getValue() == objeto3.Nombre) {
                        y = objeto3.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else {
                    y = objeto4.Edad;
                    Estado2 = true;
                }
            }
        }
        Integer z = x - y;
        lResultado.setText("Resultado: " + z);
    }

    /**
     * Botón que al ser presionada suma las edades de las personas seleccionadas o muestra un cuadro de texto mencionando de que hay algún campo vacío
     * @param event
     */
    @FXML
    void btnSumar(ActionEvent event) {
        Boolean Estado1 = false;
        Boolean Estado2 = false;
        Integer m = 1;
        Integer o = 1;
        Integer x = 0;
        Integer y = 0;
        if (cbPersona1.getValue() == null || cbPersona2.getValue() == null) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Hay algún campo vacío");
        } else {
            while (Estado1 != true) {
                if (m == 1) {
                    if (cbPersona1.getValue() == objeto.Nombre) {
                        x = objeto.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else if (m == 2) {
                    if (cbPersona1.getValue() == objeto2.Nombre) {
                        x = objeto2.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else if (m == 3) {
                    if (cbPersona1.getValue() == objeto3.Nombre) {
                        x = objeto3.Edad;
                        Estado1 = true;
                    } else {
                        m++;
                    }
                } else {
                    x = objeto4.Edad;
                    Estado1 = true;
                }
            }
            while (Estado2 != true) {
                if (o == 1) {
                    if (cbPersona2.getValue() == objeto.Nombre) {
                        y = objeto.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else if (o == 2) {
                    if (cbPersona2.getValue() == objeto2.Nombre) {
                        y = objeto2.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else if (o == 3) {
                    if (cbPersona2.getValue() == objeto3.Nombre) {
                        y = objeto3.Edad;
                        Estado2 = true;
                    } else {
                        o++;
                    }
                } else {
                    y = objeto4.Edad;
                    Estado2 = true;
                }
            }
        }
        Integer z = x + y;
        lResultado.setText("Resultado: " + z);
    }

    /**
     * Provee al combo box las 7 provincias que el usuario podrá elegir
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbProvincia.setItems(FXCollections.observableArrayList("Cartago","San José","Alajuela","Limón","Heredia","Puntarenas","Guanacaste"));
    }
}

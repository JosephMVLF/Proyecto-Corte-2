package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Ventana inicial de la aplicación que simula la pantalla de inicio de sesión
 * con opción de registro e idiomas.
 */
public class StartupWindow extends JFrame {

    /**
     * Campo de texto para ingresar el correo electrónico.
     */
    private JTextField txtCorreo;

    /**
     * Campo de texto para ingresar la contraseña.
     */
    private JPasswordField txtContrasena;

    /**
     * Botón para iniciar sesión.
     */
    private JButton btnIniciarSesion;

    /**
     * Botón para registrarse.
     */
    private JButton btnRegistrar;

    /**
     * ComboBox para seleccionar el idioma de la aplicación.
     */
    private JComboBox<String> cmbIdioma;

    /**
     * Etiqueta superior con el nombre de la aplicación.
     */
    private JLabel lblTitulo;

    /**
     * Etiqueta para indicar que debe ingresar su correo.
     */
    private JLabel lblCorreo;

    /**
     * Etiqueta para indicar que debe ingresar su contraseña.
     */
    private JLabel lblContrasena;

    /**
     * Etiqueta para mostrar el mensaje de registro.
     */
    private JLabel lblRegistro;

    /**
     * Etiqueta para indicar los idiomas disponibles.
     */
    private JLabel lblIdiomasDisponibles;

    /**
     * Panel superior de encabezado.
     */
    private JPanel panelEncabezado;

    /**
     * Panel lateral decorativo.
     */
    private JPanel panelLateral;

    /**
     * Constructor: inicializa la ventana y sus componentes.
     */
    public StartupWindow() {
        inicializarComponentes();
    }

    /**
     * Método que configura la ventana y añade los componentes.
     */
    private void inicializarComponentes() {
        this.setTitle("Mercado Libre - Inicio");
        this.setBounds(100, 100, 632, 490);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        this.getContentPane().setBackground(new Color(245, 245, 245));
        this.setResizable(false);

        // Panel superior
        panelEncabezado = new JPanel();
        panelEncabezado.setBackground(new Color(25, 25, 112));
        panelEncabezado.setBounds(0, 0, 616, 51);
        getContentPane().add(panelEncabezado);

        lblTitulo = new JLabel("Libre Merch");
        lblTitulo.setForeground(new Color(255, 255, 255));
        lblTitulo.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 31));
        panelEncabezado.add(lblTitulo);

        // Panel lateral derecho
        panelLateral = new JPanel();
        panelLateral.setBackground(new Color(0, 0, 139));
        panelLateral.setBounds(493, 51, 123, 400);
        getContentPane().add(panelLateral);

        // Correo
        lblCorreo = new JLabel("Ingrese su correo");
        lblCorreo.setBounds(47, 129, 202, 14);
        getContentPane().add(lblCorreo);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(47, 154, 202, 20);
        getContentPane().add(txtCorreo);

        // Contraseña
        lblContrasena = new JLabel("Ingrese su contraseña");
        lblContrasena.setBounds(47, 185, 202, 14);
        getContentPane().add(lblContrasena);

        txtContrasena = new JPasswordField();
        txtContrasena.setBounds(47, 210, 202, 20);
        getContentPane().add(txtContrasena);

        // Botón iniciar sesión
        btnIniciarSesion = new JButton("Iniciar sesión");
        btnIniciarSesion.setBounds(50, 256, 147, 23);
        getContentPane().add(btnIniciarSesion);

        // Mensaje de registro
        lblRegistro = new JLabel("¿No tienes cuenta? Registra tu cuenta llenando los espacios!");
        lblRegistro.setBounds(50, 300, 433, 46);
        getContentPane().add(lblRegistro);

        // Botón registrar
        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(50, 349, 147, 23);
        getContentPane().add(btnRegistrar);

        // Idiomas
        lblIdiomasDisponibles = new JLabel("Idiomas disponibles");
        lblIdiomasDisponibles.setBounds(368, 80, 133, 14);
        getContentPane().add(lblIdiomasDisponibles);

        cmbIdioma = new JComboBox<>(new String[]{
                "Seleccione...", "Español", "Inglés", "Portugués", "Latín"
        });
        cmbIdioma.setBounds(368, 105, 113, 22);
        getContentPane().add(cmbIdioma);
    }

    // ================== Getters y Setters ==================

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JPasswordField getTxtContrasena() {
        return txtContrasena;
    }

    public void setTxtContrasena(JPasswordField txtContrasena) {
        this.txtContrasena = txtContrasena;
    }

    public JButton getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(JButton btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public JComboBox<String> getCmbIdioma() {
        return cmbIdioma;
    }

    public void setCmbIdioma(JComboBox<String> cmbIdioma) {
        this.cmbIdioma = cmbIdioma;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblCorreo() {
        return lblCorreo;
    }

    public void setLblCorreo(JLabel lblCorreo) {
        this.lblCorreo = lblCorreo;
    }

    public JLabel getLblContrasena() {
        return lblContrasena;
    }

    public void setLblContrasena(JLabel lblContrasena) {
        this.lblContrasena = lblContrasena;
    }

    public JLabel getLblRegistro() {
        return lblRegistro;
    }

    public void setLblRegistro(JLabel lblRegistro) {
        this.lblRegistro = lblRegistro;
    }

    public JLabel getLblIdiomasDisponibles() {
        return lblIdiomasDisponibles;
    }

    public void setLblIdiomasDisponibles(JLabel lblIdiomasDisponibles) {
        this.lblIdiomasDisponibles = lblIdiomasDisponibles;
    }

    public JPanel getPanelEncabezado() {
        return panelEncabezado;
    }

    public void setPanelEncabezado(JPanel panelEncabezado) {
        this.panelEncabezado = panelEncabezado;
    }

    public JPanel getPanelLateral() {
        return panelLateral;
    }

    public void setPanelLateral(JPanel panelLateral) {
        this.panelLateral = panelLateral;
    }
    
    /**
     * Limpia todos los campos de la ventana, estableciendo valores por defecto.
     * Reinicia el ComboBox de idioma a su primera opción y limpia los campos de texto.
     */
    public void limpiarCampos() {
        txtCorreo.setText("");
        txtContrasena.setText("");
        cmbIdioma.setSelectedIndex(0);
    }
}

<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<html>
<head>
    <title>Bibliothèque</title>
</head>
<body>
    <form action="Save" method="get">
        <h1>Enregistrement d'un livre</h1>

        <h2>Le livre</h2>
        <table>
            <tr>
                <td>Titre :</td>
                <td><input type="text" name="titre"></td>
            </tr>
            <tr>
                <td>Catégorie :</td>
                <td>
                    <select name="categorie">
                        <option value="Roman">Roman</option>
                        <option value="Policier">Policier</option>
                        <option value="Junior">Junior</option>
                        <option value="Philosophie">Philosophie</option>
                        <option value="Sciences-fiction">Sciences-fiction</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Numéro ISBN :</td>
                <td><input type="number" name="isbn"></td>
            </tr>
        </table>

        <h2>L'auteur</h2>
        <table>
            <tr>
                <td>Nom :</td>
                <td><input type="text" name="nom"></td>
                <td>Prénom :</td>
                <td><input type="text" name="prenom"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Valider"></td>
            </tr>
        </table>
    </form>
</body>
</html>

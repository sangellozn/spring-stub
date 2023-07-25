create table necessite_quantite (valeur numeric(15,2) not null, ingredient_id varchar(36) not null, recette_id varchar(36) not null, primary key (ingredient_id, recette_id));
create table objet (conteneur boolean not null, id varchar(36) not null, nom varchar(100) not null, description varchar(255), primary key (id));
create table peut_stocker_quantite (valeur numeric(15,2), conteneur_id varchar(36) not null, contenu_id varchar(36) not null, primary key (conteneur_id, contenu_id));
create table recette (id varchar(36) not null, nom varchar(100) not null, description varchar(255), primary key (id));
create table utilisateur (id varchar(36) not null, nom varchar(150) not null, prenom varchar(150) not null, primary key (id));
